package tripillarsCodingAssignment.module3;
//Create a class BankAccount with accountNumber and balance, and methods deposit() and withdraw().
public class BankAccount {

    // Instance variables
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("5645152535", 1000);

        account.displayAccountDetails();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1000); // Should show insufficient balance
        account.displayAccountDetails();
    }
}