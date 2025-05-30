// The shared resource - a bounded buffer
public class ServingCounter {

    private String[] dishes;
    private int capacity;
    private int count = 0;

    public ServingCounter(int capacity) {
        this.capacity = capacity;
        dishes = new String[capacity];
        System.out.println("Serving counter ready with capacity for " + capacity + " dishes.");
    }

    public synchronized void addDish(String chef, String dish) {
        while (count >= capacity) {
            try{
                System.out.println(chef + " waits - counter is full!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        dishes[count] = dish;
        count++;
        System.out.println(chef + " prepared " + dish + " on the counter");

        displayCounter();
        notifyAll();
    }

    public synchronized String takeDish(String waiter){
        while(count <= 0) {
            try {
                System.out.println(waiter + " waits - no dishes available!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String dish = dishes[count-1];
        dishes[count - 1] = null;
        count--;

        System.out.println(waiter + " took a " + dish + " from counter");
        displayCounter();

        notifyAll();
        return dish;
    }

    public void displayCounter() {
        StringBuilder sb = new StringBuilder("Counter: [");
        for (int i = 0; i<capacity; i++) {
            if (i < count) {
                sb.append(dishes[i]);
            } else {
                sb.append("empty");
            }

            if(i < capacity - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}