public class Main {
    public static void main(String[] args) {

        ServingCounter servingCounter = new ServingCounter(5);
        Thread chef1 = new Thread(new Chef(new String[]{"pizza", "burger"}, "Nikola", servingCounter));
        Thread chef2 = new Thread(new Chef(new String[]{"salad", "burger"}, "Nikola", servingCounter));

        Thread waiter1 = new Thread(new Waiter("Waiter1", servingCounter));
        Thread waiter2 = new Thread(new Waiter("Waiter2", servingCounter));

        chef1.start();
        chef2.start();
        waiter1.start();
        waiter2.start();
        waiter1.interrupt();
        waiter2.interrupt();

        try {
//            chef1.join();
//            chef2.join();
//            waiter1.join();
//            waiter2.join();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Restaurant is closing");
        System.exit(0);

    }
}