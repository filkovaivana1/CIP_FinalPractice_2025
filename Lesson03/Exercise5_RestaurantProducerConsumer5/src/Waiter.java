public class Waiter implements Runnable{

    ServingCounter servingCounter;
    String name;

    public Waiter(ServingCounter servingCounter, String name) {
        this.servingCounter = servingCounter;
        this.name = name;
    }

    @Override
    public void run() {
        try{
            while (true) {
                String dish = servingCounter.takeDish(name);

                System.out.println("Waiter " + name + " is serving a " + dish + " on the table");
                Thread.sleep(2000);

                System.out.println("Waiter " + name + " delivered " + dish + " to the customers");                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            System.out.println("Interruption happened.");
            System.out.println("Waiter going home");
//            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
//    ServingCounter servingCounter;
//    String name;
//
//    public Waiter(ServingCounter servingCounter, String name) {
//        this.servingCounter = servingCounter;
//        this.name = name;
//
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//
//            String dish = servingCounter.takeDish(name);
//
//            System.out.println(name +  " is serving " + dish  + " on table");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(name + " finished serving on the table");
//
//        }
//
//    }
}
