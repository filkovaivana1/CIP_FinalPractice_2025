public class Chef implements Runnable{

    ServingCounter servingCounter;
    String name;
    String[] specialties;

    public Chef(ServingCounter servingCounter, String name, String[] specialties) {
        this.servingCounter = servingCounter;
        this.name = name;
        this.specialties = specialties;
    }

    @Override
    public void run() {
        try{
            while (true) {
                String dish = specialties[(int) (Math.random() * specialties.length)];
                System.out.println("Chef " + name + " is preparing a dish...");

                Thread.sleep(2000);
                servingCounter.putDish(name, dish);
                System.out.println("Chef " + name + " placed a " + dish + " on the counter");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interruption happened.");
            System.out.println("Chef going home");
            e.printStackTrace();
        }
    }

    //    ServingCounter servingCounter;
//    String name;
//    String[] specialties;
//
//    public Chef(ServingCounter servingCounter, String name, String[] specialties) {
//        this.servingCounter = servingCounter;
//        this.name = name;
//        this.specialties = specialties;
//    }
//
//    @Override
//    public void run() {
//        try{
//        while (true) {
//            String dish = specialties[(int) (Math.random() * specialties.length)];
//            System.out.println(name + "will prepare " + dish);
//
//            Thread.sleep(2000);
//
//
//            servingCounter.putDish(name, dish);
//            System.out.println(name + "put dish on the counter");
//
//            Thread.sleep(2000);
////            try {
////
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//
//        }
//        } catch (InterruptedException e) {
////           e.printStackTrace();
//            System.out.println("Chef " + name + " going home!");
//            Thread.currentThread().interrupt();
//        }
//
//    }

}
