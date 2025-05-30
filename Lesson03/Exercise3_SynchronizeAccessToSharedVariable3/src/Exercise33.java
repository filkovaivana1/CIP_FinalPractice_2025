public class Exercise33 {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public static void main(String[] args) throws InterruptedException {
        Exercise33 counter = new Exercise33();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

//        t1.join();
////        t2.join();

        System.out.println("Count: " + counter.count);

                t1.join();
        t2.join();
        System.out.println("Count: " + counter.count);
    }
}