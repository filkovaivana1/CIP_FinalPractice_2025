public class Exercise11 extends Thread {

    private int counter = 10;
    private static int countThreads = 0;
    private int threadNo = ++countThreads;

    public Exercise11() {
        System.out.println("Creating thread no." + threadNo);
    }

    public void run() {
        while (true) {
            System.out.println("Thread" + threadNo + " (" + counter +
                    ")");
            counter --;
            if (counter == 0) return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Exercise11 at = new Exercise11();
            at.start();
            System.out.println("Thread name: " + at.getName());
            System.out.println("Thread priority: " + at.getPriority());
            at.setPriority(i+1);
            System.out.println("Changed priority: " + at.getPriority());
            System.out.println("Thread declaration: " + at);

        }
        System.out.println("All threads have been started");
    }
}