public class Runner extends Thread {
    private static final int TRACK_LENGTH = 100;
    private static boolean hasWinner = false;
    private String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int distance = 0;

        while (distance < TRACK_LENGTH && !hasWinner) {
            int step = (int)(Math.random() * 5);
            distance += step;

            printProgress(distance);

            if(distance >= TRACK_LENGTH && !hasWinner) {
               hasWinner = true;
                System.out.println(name + " won the race");
                System.out.println("Race is over other runners will stop");
            }
            try{
                Thread.sleep((int) Math.random() * 200);
            }
            catch (InterruptedException e) {}

        }
    }

    public void printProgress(int distance) {
        StringBuilder track = new StringBuilder();

        for (int i = 0; i<TRACK_LENGTH; i++) {
            if(i == distance) {
                track.append(name.charAt(0));
            } else {
                track.append("-");
            }
        }

        track.append("END");
        System.out.println(name + ": " + track.toString() + " " + distance + "%");

    }

}