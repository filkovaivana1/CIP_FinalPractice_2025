public class Main {
    public static void main(String[] args) {

        ServingCounter servingCounter = new ServingCounter(5);
        Thread chef1 = new Thread(new Chef(servingCounter, "Gordon", new String[]{"Pizza", "Pasta", "Salad"}));
        Thread chef2 = new Thread(new Chef(servingCounter, "Jack", new String[]{"Burger", "Steak", "Salad"}));

        Thread waiter1 = new Thread(new Waiter(servingCounter, "Emily"));
        Thread waiter2 = new Thread(new Waiter(servingCounter, "Tom"));

        chef1.start();
        chef2.start();
        waiter1.start();
        waiter2.start();

        waiter1.interrupt();
        waiter2.interrupt();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Restaurant is closing.");
        System.exit(0);

        //        ServingCounter servingCounter = new ServingCounter(5);
//        Thread threadChef1 = new Thread(new Chef(servingCounter, "JAck", new String[]{"Pizza", "Burger"}));
//        Thread threadChef2 = new Thread(new Chef(servingCounter, "Chef 2", new String[]{"Steak", "Burger"}));
//
//
//        Thread threadWaiter1 = new Thread(new Waiter(servingCounter, "Waiter2"));
//        Thread threadWaiter2 = new Thread(new Waiter(servingCounter, "Emily"));
//
//
//        threadChef1.start();
//        threadChef2.start();
//        threadWaiter1.start();
//        threadWaiter2.start();
//
//        threadChef1.interrupt();
//        threadChef2.interrupt();
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {e.printStackTrace();}
//
//        System.out.println("Restaurant closing");
//        System.exit(0);

    }
}