public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Created account with initial balance: $" + initialBalance);
    }

    // Synchronized method to ensure thread-safe deposits
    public synchronized void deposit(double amount, String transactionName) {
        System.out.println(transactionName + ": Starting deposit of $" + amount);
        System.out.println(transactionName + ": Balance before withdrawal: $" + balance);

        // Simulate some processing time
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update balance
        double newBalance = balance + amount;

        // Simulate more processing time
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
        System.out.println(transactionName + ": Deposit completed. New balance: $" + balance);
    }

    // Synchronized method to ensure thread-safe withdrawals
    public synchronized boolean withdraw(double amount, String transactionName) {
        System.out.println(transactionName + ": Starting withdrawal of $" + amount);
        System.out.println(transactionName + ": Balance before withdrawal: $" + balance);

        // Check if there's enough balance
        if (balance < amount) {
            System.out.println(transactionName + ": Insufficient funds! Withdrawal failed.");
            return false;
        }

        // Simulate some processing time
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update balance
        double newBalance = balance - amount;

        // Simulate more processing time
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
        System.out.println(transactionName + ": Withdrawal completed. New balance: $" + balance);
        return true;
    }

    public double getBalance() {
        return balance;
    }
}