public class Exercise111 extends Thread {

    private int counter = 10;
    private static int countThreads = 0;
    private int threadNum = ++countThreads;

    public Exercise111() {
        System.out.println("Creating a thread :" + threadNum);
    }

    @Override
    public void run() {
        System.out.println("Thread: " + threadNum + "("+ counter + ")");
        counter--;
    }
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            Exercise111 exercise111 = new Exercise111();
            exercise111.start();
            System.out.println("Thread name: " + exercise111.getName());
            System.out.println("Thread priority: " + exercise111.getPriority());
            System.out.println("is the thread alive" + exercise111.isAlive());
            System.out.println("thread declaration " + exercise111);
        }

        System.out.println("All the threads are running");


    }
}