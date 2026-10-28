package Day03;

class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException(
                    "Opening balance cannot be negative."
            );
        }

        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Hariharan", 1000);

        System.out.println("Holder: " + account.getAccountHolder());

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Balance: Rs. " + account.getBalance());

        account.withdraw(2000);
        account.deposit(100);

        System.out.println("Final balance: Rs. " + account.getBalance());


    }
}
