/**
 * RestaurantProducerConsumerExample - Demonstrates the Producer-Consumer pattern with threads
 *
 * This program simulates a restaurant kitchen where:
 * - Chefs (producers) prepare dishes and add them to a limited-size serving counter
 * - Waiters (consumers) take dishes from the counter and serve them to customers
 *
 * This example demonstrates:
 * 1. Thread coordination using wait() and notifyAll()
 * 2. Bounded buffer (the serving counter with limited capacity)
 * 3. Producer-Consumer pattern in a real-world scenario
 */
public class RestaurantProducerConsumerExample {

    public static void main(String[] args) {
        System.out.println("Restaurant Kitchen Simulation - Producer-Consumer Pattern");
        System.out.println("=========================================================");

        ServingCounter servingCounter = new ServingCounter(5);

        Thread chef1 = new Thread(new Chef(servingCounter, "Chef Gordon", new String[]{"Pizza", "Pasta", "Risoto"}));
        Thread chef2 = new Thread(new Chef(servingCounter, "Chef Todd", new String[]{"Burger", "Steak", "Salad"}));

        Thread waiter1 = new Thread(new Waiter(servingCounter, "Waiter Emily"));
        Thread waiter2 = new Thread(new Waiter(servingCounter, "Waiter James"));

        chef1.start();
        chef2.start();
        waiter1.start();
        waiter2.start();
//        chef1.interrupt();
//        chef2.interrupt();
//        waiter1.interrupt();
//        waiter2.interrupt();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Restaurant is closing");
        System.exit(0);


    }
}
    