// Waiter class - the consumer
public class Waiter implements Runnable{

    private String name;
    private ServingCounter servingCounter;

    public Waiter(String name, ServingCounter servingCounter) {
        this.name = name;
        this.servingCounter = servingCounter;
    }


    public void run() {
        while (true) {

            servingCounter.takeDish(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Waiter going home");
                Thread.currentThread().interrupt();
            }

        }

    }

}