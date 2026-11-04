package Day06;

import java.util.Objects;
import java.util.Scanner;

// 1. CUSTOM DOMAIN EXCEPTIONS

class LibraryException extends RuntimeException {
    public LibraryException(String message) {
        super(message);
    }
}

class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException(int id) {
        super("Item with ID #" + id + " does not exist.");
    }
}

class MemberNotFoundException extends LibraryException {
    public MemberNotFoundException(int id) {
        super("Member with ID #" + id + " does not exist.");
    }
}

class ItemAlreadyBorrowedException extends LibraryException {
    public ItemAlreadyBorrowedException(String title, String borrowerName) {
        super("\"" + title + "\" is already checked out by " + borrowerName + ".");
    }
}

class ItemNotBorrowedException extends LibraryException {
    public ItemNotBorrowedException(String title) {
        super("\"" + title + "\" is not currently borrowed.");
    }
}

class DuplicateRecordException extends LibraryException {
    public DuplicateRecordException(String message) {
        super(message);
    }
}

class ValidationException extends LibraryException {
    public ValidationException(String message) {
        super(message);
    }
}

// ==========================================
// 2. MAIN APPLICATION
// ==========================================

public class LibraryManagementSystemWithErrorHandling {
    public static void main(String[] args) {
        Library library = new Library();

        // Initial catalog setup
        try {
            library.addItem(new Book(101, "The Great Gatsby", "F. Scott Fitzgerald"));
            library.addItem(new Book(102, "Clean Code", "Robert C. Martin"));
            library.addItem(new DVD(201, "Inception", "Christopher Nolan", 148));
            library.addMember(new Member(1, "Hari"));
            library.addMember(new Member(2, "Sukish"));
        } catch (LibraryException e) {
            System.err.println("Init warning: " + e.getMessage());
        }

        System.out.println("=================================================");
        System.out.println("      CUSTOM DEV LIBRARY MANAGEMENT SYSTEM        ");
        System.out.println("=================================================");

        // try-with-resources auto-closes Scanner when leaving main
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n----------------- MAIN MENU -----------------");
                System.out.println("1. View Full Inventory");
                System.out.println("2. View Borrowed Items");
                System.out.println("3. View Registered Members");
                System.out.println("4. Borrow an Item");
                System.out.println("5. Return an Item");
                System.out.println("6. Add a New Book");
                System.out.println("7. Add a New DVD");
                System.out.println("8. Register a New Member");
                System.out.println("9. Exit");
                System.out.print("Enter your choice (1-9): ");

                String choiceInput = scanner.nextLine().trim();

                try {
                    switch (choiceInput) {
                        case "1":
                            library.displayInventory();
                            break;

                        case "2":
                            library.displayBorrowedItems();
                            break;

                        case "3":
                            library.displayMembers();
                            break;

                        case "4":
                            System.out.print("Enter Item ID to borrow: ");
                            int borrowItemId = readInt(scanner);
                            System.out.print("Enter Member ID: ");
                            int borrowMemberId = readInt(scanner);
                            library.borrowItem(borrowItemId, borrowMemberId);
                            break;

                        case "5":
                            System.out.print("Enter Item ID to return: ");
                            int returnItemId = readInt(scanner);
                            library.returnItem(returnItemId);
                            break;

                        case "6":
                            System.out.print("Enter Book ID (e.g. 103): ");
                            int bookId = readInt(scanner);
                            System.out.print("Enter Book Title: ");
                            String bookTitle = scanner.nextLine().trim();
                            System.out.print("Enter Author Name: ");
                            String author = scanner.nextLine().trim();

                            library.addItem(new Book(bookId, bookTitle, author));
                            System.out.println("Book added successfully.");
                            break;

                        case "7":
                            System.out.print("Enter DVD ID (e.g. 202): ");
                            int dvdId = readInt(scanner);
                            System.out.print("Enter DVD Title: ");
                            String dvdTitle = scanner.nextLine().trim();
                            System.out.print("Enter Director: ");
                            String director = scanner.nextLine().trim();
                            System.out.print("Enter Duration (in minutes): ");
                            int duration = readInt(scanner);

                            library.addItem(new DVD(dvdId, dvdTitle, director, duration));
                            System.out.println("DVD added successfully.");
                            break;

                        case "8":
                            System.out.print("Enter Member ID (e.g. 3): ");
                            int memberId = readInt(scanner);
                            System.out.print("Enter Member Name: ");
                            String memberName = scanner.nextLine().trim();

                            library.addMember(new Member(memberId, memberName));
                            System.out.println("Member registered successfully.");
                            break;

                        case "9":
                            System.out.println("Thank you for using Community Library. Goodbye!");
                            running = false;
                            break;

                        default:
                            System.out.println("Invalid choice. Please select an option between 1 and 9.");
                            break;
                    }
                } catch (LibraryException e) {
                    System.err.println("Operation Error: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("Unexpected system error: " + e.getMessage());
                }
            }
        }
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid format. Please enter a valid whole number: ");
            }
        }
    }
}

// ==========================================
// 3. MODELS & HIERARCHY
// ==========================================

abstract class Item {
    private int id;
    private String title;
    private boolean isBorrowed;
    private Member currentBorrower;

    public Item(int id, String title) {
        if (id <= 0) {
            throw new ValidationException("Item ID must be positive. Provided: " + id);
        }
        if (title == null || title.isBlank()) {
            throw new ValidationException("Item title cannot be blank.");
        }
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
        this.currentBorrower = null;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public Member getCurrentBorrower() {
        return currentBorrower;
    }

    public void borrow(Member member) {
        if (member == null) {
            throw new ValidationException("Cannot assign checkout to a null member.");
        }
        if (this.isBorrowed) {
            throw new ItemAlreadyBorrowedException(this.title, this.currentBorrower.getName());
        }
        this.isBorrowed = true;
        this.currentBorrower = member;
    }

    public void returnBack() {
        if (!this.isBorrowed) {
            throw new ItemNotBorrowedException(this.title);
        }
        this.isBorrowed = false;
        this.currentBorrower = null;
    }

    public abstract void displayInfo();
}

class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        if (author == null || author.isBlank()) {
            throw new ValidationException("Book author cannot be blank.");
        }
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        String status = isBorrowed() ? "Borrowed by " + getCurrentBorrower().getName() : "Available";
        System.out.println("[Book] #" + getId() + " \"" + getTitle() + "\" by " + author + " | Status: " + status);
    }
}

class DVD extends Item {
    private String director;
    private int durationMinutes;

    public DVD(int id, String title, String director, int durationMinutes) {
        super(id, title);
        if (director == null || director.isBlank()) {
            throw new ValidationException("DVD director cannot be blank.");
        }
        if (durationMinutes <= 0) {
            throw new ValidationException("Duration must be greater than 0 minutes.");
        }
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public void displayInfo() {
        String status = isBorrowed() ? "Borrowed by " + getCurrentBorrower().getName() : "Available";
        System.out.println("[DVD]  #" + getId() + " \"" + getTitle() + "\" (Dir: " + director + ", " + durationMinutes + " mins) | Status: " + status);
    }
}

class Member {
    private int id;
    private String name;

    public Member(int id, String name) {
        if (id <= 0) {
            throw new ValidationException("Member ID must be positive. Provided: " + id);
        }
        if (name == null || name.isBlank()) {
            throw new ValidationException("Member name cannot be blank.");
        }
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Member #" + id + ": " + name);
    }
}

// ==========================================
// 4. CONTROLLER WITH EXCEPTION PROPAGATION
// ==========================================

class Library {
    private Item[] items;
    private int itemCount;

    private Member[] members;
    private int memberCount;

    public Library() {
        this.items = new Item[50];
        this.itemCount = 0;
        this.members = new Member[20];
        this.memberCount = 0;
    }

    public void addItem(Item item) {
        Objects.requireNonNull(item, "Item to add cannot be null");

        if (findItem(item.getId()) != null) {
            throw new DuplicateRecordException("Item with ID #" + item.getId() + " already exists in the catalog.");
        }
        if (itemCount >= items.length) {
            throw new LibraryException("Catalog capacity reached. Cannot add more items.");
        }

        items[itemCount++] = item;
    }

    public void addMember(Member member) {
        Objects.requireNonNull(member, "Member to add cannot be null");

        if (findMember(member.getId()) != null) {
            throw new DuplicateRecordException("Member with ID #" + member.getId() + " is already registered.");
        }
        if (memberCount >= members.length) {
            throw new LibraryException("Member list capacity reached. Cannot register more members.");
        }

        members[memberCount++] = member;
    }

    public Item findItem(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        return null;
    }

    public Member findMember(int id) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }
        return null;
    }

    public void borrowItem(int itemId, int memberId) {
        Item item = findItem(itemId);
        if (item == null) {
            throw new ItemNotFoundException(itemId);
        }

        Member member = findMember(memberId);
        if (member == null) {
            throw new MemberNotFoundException(memberId);
        }

        // item.borrow() will throw ItemAlreadyBorrowedException if already loaned out
        item.borrow(member);
        System.out.println("Success: \"" + item.getTitle() + "\" checked out to " + member.getName() + ".");
    }

    public void returnItem(int itemId) {
        Item item = findItem(itemId);
        if (item == null) {
            throw new ItemNotFoundException(itemId);
        }

        Member borrower = item.getCurrentBorrower();
        // item.returnBack() will throw ItemNotBorrowedException if not currently checked out
        item.returnBack();
        System.out.println("Success: \"" + item.getTitle() + "\" returned by " + borrower.getName() + ".");
    }

    public void displayInventory() {
        System.out.println("\n--- Inventory Report (" + itemCount + " items) ---");
        if (itemCount == 0) {
            System.out.println("No items in library.");
            return;
        }
        for (int i = 0; i < itemCount; i++) {
            items[i].displayInfo();
        }
    }

    public void displayBorrowedItems() {
        System.out.println("\n--- Currently Borrowed Items ---");
        int borrowedCount = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isBorrowed()) {
                System.out.println("  • [#" + items[i].getId() + "] \"" + items[i].getTitle() + "\" -> " + items[i].getCurrentBorrower().getName());
                borrowedCount++;
            }
        }
        if (borrowedCount == 0) {
            System.out.println("  No items currently on loan.");
        }
    }

    public void displayMembers() {
        System.out.println("\n--- Registered Members (" + memberCount + " members) ---");
        if (memberCount == 0) {
            System.out.println("No registered members.");
            return;
        }
        for (int i = 0; i < memberCount; i++) {
            members[i].displayInfo();
        }
    }
}
