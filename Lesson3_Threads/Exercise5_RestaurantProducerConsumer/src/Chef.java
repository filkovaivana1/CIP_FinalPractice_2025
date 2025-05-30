// Chef class - the producer
public class Chef implements Runnable {

    private ServingCounter servingCounter;
    private String name;
    private String[] specialties;

    public Chef(ServingCounter servingCounter, String name, String[] specialties) {
        this.servingCounter = servingCounter;
        this.name = name;
        this.specialties = specialties;
    }

    @Override
    public void run() {

        while (true)  {
             String dish = specialties[(int) (Math.random() * specialties.length)];

                System.out.println(name + " is preparing " + dish + "...");
                try{
                Thread.sleep((int) (Math.random() * 1000));

                servingCounter.addDish(name, dish);
                Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Going home");
                }
            }


    }


}