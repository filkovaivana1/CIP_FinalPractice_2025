public class PrimeCheckerTask implements Runnable {
    private final int number;

    public PrimeCheckerTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = isPrime(number);
        String result = isPrime ? "is a prime number." : "is not a prime number.";
        System.out.println(Thread.currentThread().getName() + ": " + number + " " + result);
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}