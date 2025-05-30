class Exercise3 {

    private int count = 0;

    public synchronized void increment() {
        count--;
        count++;
        count++;
    }


    public static void main(String[] args) throws InterruptedException {

                Exercise3 counter = new Exercise3();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1: " + counter.count);
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2: " + counter.count);
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + counter.count);
    }
}