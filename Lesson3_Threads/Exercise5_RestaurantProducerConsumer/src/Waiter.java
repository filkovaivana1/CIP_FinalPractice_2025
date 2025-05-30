// Waiter class - the consumer
public class Waiter implements Runnable {
    ServingCounter servingCounter;
    String name;

    public Waiter(ServingCounter servingCounter, String name) {
        this.servingCounter = servingCounter;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
               String dish = servingCounter.takeDish(name);

                System.out.println(name + " is serving " + dish + " on the table");
                Thread.sleep((int)(Math.random() * 2000));

                System.out.println(name + " finished serving the " + dish  + "to customers." );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
