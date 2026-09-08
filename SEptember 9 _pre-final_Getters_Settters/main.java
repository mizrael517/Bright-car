public class Main {

    static class BankAccount {
        private String accountName;
        private double balance;

        // Constructor
        BankAccount(String accountName, double balance) {
            this.accountName = accountName;
            this.balance = balance;
        }

        // Getter
        public String getAccountName() {
            return accountName;
        }

        // Setter
        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        // Getter
        public double getBalance() {
            return balance;
        }

        // Method for depositing money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: ₱" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method for withdrawing money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: ₱" + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        // Method to display account information
        public void displayAccount() {
            System.out.println("\nBANK ACCOUNT");
            System.out.println("------------");
            System.out.println("Account Name: " + getAccountName());
            System.out.println("Balance: ₱" + getBalance());
        }
    }

    public static void main(String[] args) {

        // Create account using constructor
        BankAccount account = new BankAccount("Juan Dela Cruz", 5000);

        // Display initial information
        account.displayAccount();

        // Use methods
        account.deposit(2000);
        account.withdraw(1000);

        // Display updated information
        account.displayAccount();

        // Use setter
        account.setAccountName("Pedro Santos");

        System.out.println("\nUpdated Account Name: "
                + account.getAccountName());
    }
}