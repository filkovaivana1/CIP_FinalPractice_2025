public class Exercise22 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TickTack("Clock1", 600));
        Thread thread2 = new Thread(new TickTack("Clock2", 400));

        thread1.start();
        thread2.start();



    }
}