import java.util.SplittableRandom;

public class ServingCounter {

    private String[] dishes;
    private int capacity;
    private int count = 0;

    public ServingCounter(int capacity) {
        this.capacity = capacity;
        dishes = new String[capacity];
    }

    public synchronized void putDish(String chef, String dish) {
        while (capacity <= count) {
            try {
                System.out.println("Chef " + chef + " wait - counter is full!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        dishes[count] = dish;
        count++;
        System.out.println("Chef " + chef + " set a " + dish + " on the counter");

        displayCounter();
        notifyAll();
    }

    public synchronized String takeDish(String waiter) throws InterruptedException {
        while (count <= 0) {
            System.out.println("Waiter " + waiter + " wait - counter is empty");

                wait();

        }

        String dish = dishes[count-1];
        dishes[count-1] = null;
        count--;

        System.out.println("Waiter " + waiter + " took a " + dish + " from the counter");

        displayCounter();
        notifyAll();
        return dish;
    }

    public void displayCounter() {
        StringBuilder stringBuilder = new StringBuilder("Counter [");

        for (int i=0; i<capacity; i++) {
            if (i < count) {
                stringBuilder.append(dishes[i]);
            } else {
                stringBuilder.append("Empty");
            }

            if (i<(capacity-1)) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }


    //
//    private String[] dishes;
//    public int capacity;
//    public static int count = 0;
//
//    public ServingCounter(int capacity) {
//        this.capacity = capacity;
//        dishes = new String[5];
//    }
//
//    public synchronized void putDish(String chef, String dish){
//
//        if (capacity <= count) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(chef + "is placing " + dish + "on counter");
//        dishes[count] = dish;
//        count++;
//
//        System.out.println(chef + "placed " + dish + "on counter");
//        notifyAll();
//    }
//
//    public synchronized String takeDish(String waiter){
//
//        while (count <= 0) {
//            try{
//                System.out.println("Waiter " + waiter + " waiting - no dishes on counter" );
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        String dish1 = dishes[count-1];
//        System.out.println(waiter + "is taking " + dish1 + "from counter");
//        dishes[count-1] = null;
//        count--;
//
//        System.out.println(waiter + "took " + dish1 + "from counter");
//        return dish1;
//    }
}
