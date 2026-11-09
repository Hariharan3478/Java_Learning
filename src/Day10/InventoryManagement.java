package Day10;

import java.util.*;
import java.util.stream.*;

class Product {

    int id;
    String name;
    String category;
    double price;
    int quantity;

    Product(int id, String name, String category,
            double price, int quantity) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return id + " | " + name + " | " +
                category + " | " + price + " | " + quantity;
    }
}

public class InventoryManagement {

    static Scanner sc = new Scanner(System.in);

    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Sort by Price");
            System.out.println("6. Sort by Quantity");
            System.out.println("7. Group by Category");
            System.out.println("8. Low Stock Products");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Category-wise Analytics");
            System.out.println("11. Update Product Quantity");
            System.out.println("12. Delete Product");
            System.out.println("13. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    searchById();
                    break;

                case 4:
                    searchByName();
                    break;

                case 5:
                    sortByPrice();
                    break;

                case 6:
                    sortByQuantity();
                    break;

                case 7:
                    groupByCategory();
                    break;

                case 8:
                    lowStockProducts();
                    break;

                case 9:
                    totalInventoryValue();
                    break;

                case 10:
                    categoryAnalytics();
                    break;

                case 11:
                    updateQuantity();
                    break;

                case 12:
                    deleteProduct();
                    break;

                case 13:
                    System.out.println("Exiting Inventory Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 13);

        sc.close();
    }


    static void addProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        boolean exists = products.stream()
                .anyMatch(p -> p.id == id);

        if (exists) {
            System.out.println("Product ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Invalid price or quantity!");
            return;
        }

        products.add(new Product(id, name, category, price, quantity));

        System.out.println("Product added successfully!");
    }

    static void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        products.forEach(System.out::println);
    }

    static void searchById() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Optional<Product> result = products.stream()
                .filter(p -> p.id == id)
                .findFirst();

        System.out.println(result.orElse(null));
    }

    static void searchByName() {

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        List<Product> result = products.stream()
                .filter(p -> p.name.equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Product not found!");
        } else {
            result.forEach(System.out::println);
        }
    }

    static void sortByPrice() {

        products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);
    }

    static void sortByQuantity() {

        products.stream()
                .sorted(Comparator.comparingInt(
                        (Product p) -> p.quantity).reversed())
                .forEach(System.out::println);
    }

    static void groupByCategory() {

        Map<String, List<Product>> result = products.stream()
                .collect(Collectors.groupingBy(p -> p.category));

        result.forEach((category, list) -> {

            System.out.println("\nCategory: " + category);

            list.forEach(System.out::println);
        });
    }

    static void lowStockProducts() {

        products.stream()
                .filter(p -> p.quantity < 10)
                .forEach(System.out::println);
    }

    static void totalInventoryValue() {

        double total = products.stream()
                .mapToDouble(p -> p.price * p.quantity)
                .sum();

        System.out.println("Total Inventory Value: " + total);
    }


    static void categoryAnalytics() {

        Map<String, Double> result = products.stream()
                .collect(Collectors.groupingBy(
                        p -> p.category,
                        Collectors.summingDouble(
                                p -> p.price * p.quantity)
                ));

        result.forEach((category, value) -> {

            System.out.println(category + " : " + value);
        });
    }


    static void updateQuantity() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Optional<Product> result = products.stream()
                .filter(p -> p.id == id)
                .findFirst();

        if (result.isPresent()) {

            System.out.print("Enter New Quantity: ");
            int quantity = sc.nextInt();

            if (quantity < 0) {
                System.out.println("Quantity cannot be negative!");
                return;
            }

            result.get().quantity = quantity;

            System.out.println("Quantity updated successfully!");

        } else {

            System.out.println("Product not found!");
        }
    }


    static void deleteProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        boolean removed = products.removeIf(p -> p.id == id);

        if (removed) {
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }
}
