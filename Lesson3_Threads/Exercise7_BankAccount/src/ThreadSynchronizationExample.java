/**
 * ThreadSynchronizationExample - Demonstrates the concept of thread synchronization
 *
 * This program simulates a bank account with multiple transactions happening
 * concurrently. It shows how synchronization prevents race conditions and ensures
 * data consistency when multiple threads access shared resources.
 */
public class ThreadSynchronizationExample {

    public static void main(String[] args) {
        System.out.println("Thread Synchronization Demonstration - Bank Account");
        System.out.println("==================================================");

        // Create a shared bank account with initial balance
        BankAccount account = new BankAccount(1000);
        BankAccount account1 = new BankAccount(1000);

        Thread thread1 = new Thread(new DepositTask(account, "Deposit-1", 200));
        Thread thread2 = new Thread(new DepositTask(account, "Deposit-2", 900));
        Thread thread3 = new Thread(new WithdrawTask(account, "Deposit-1", 100));
        Thread thread4 = new Thread(new WithdrawTask(account, "Deposit-1", 400));


        // Create threads for different transactions
        Thread depositThread1 = new Thread(new DepositTask(account, "Deposit-1", 200));
        Thread depositThread2 = new Thread(new DepositTask(account, "Deposit-2", 300));
        Thread withdrawThread1 = new Thread(new WithdrawTask(account, "Withdraw-1", 400));
        Thread withdrawThread2 = new Thread(new WithdrawTask(account, "Withdraw-2", 150));

        // Start all transaction threads
        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();

        // Wait for all transactions to complete
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final balance
        System.out.println("\nAll transactions completed!");
        System.out.println("Final account balance: $" + account.getBalance());
        System.out.println("\nNote: Without synchronization, the final balance would be unpredictable");
        System.out.println("due to race conditions between threads accessing the account simultaneously.");
    }
}