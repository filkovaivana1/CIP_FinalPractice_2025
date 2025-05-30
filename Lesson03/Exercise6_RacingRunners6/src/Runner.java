public class Runner extends Thread {
    private String name;
    private static final int TRACK_LENGTH = 100;
    private static boolean hasWinner= false;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int distance = 0;

        while (distance < TRACK_LENGTH && !hasWinner) {
            int step = (int) (Math.random() * 5);
            distance += step;

            printProgress(distance);

            if (distance >= TRACK_LENGTH && !hasWinner) {
                hasWinner = true;
                System.out.println(name + " won the race.");
            }

            try {
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {

            }
            }
    }

    public void printProgress(int distance) {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<TRACK_LENGTH; i++){
            if (i == distance) {
                stringBuilder.append(name.charAt(0));
            } else {
                stringBuilder.append("-");
            }
        }

        stringBuilder.append("END");
        System.out.println("Runner " + name + stringBuilder.toString() + ", " + distance + "%");


    }

}

//public class Runner extends Thread {
//    private static final int TRACK_LENGTH = 100;
//    private static boolean hasWinner = false;
//    private String name;
//
//    public Runner(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        int distance = 0;
//
//        while (distance < TRACK_LENGTH && !hasWinner) {
//            int step = (int)(Math.random() * 5);
//            distance += step;
//
//            printProgress(distance);
//
//            if(distance >= TRACK_LENGTH && !hasWinner) {
//               hasWinner = true;
//                System.out.println(name + " won the race");
//                System.out.println("Race is over other runners will stop");
//            }
//            try{
//                Thread.sleep((int) Math.random() * 200);
//            }
//            catch (InterruptedException e) {}
//
//        }
//    }
//
//    public void printProgress(int distance) {
//        StringBuilder track = new StringBuilder();
//
//        for (int i = 0; i<TRACK_LENGTH; i++) {
//            if(i == distance) {
//                track.append(name.charAt(0));
//            } else {
//                track.append("-");
//            }
//        }
//
//        track.append("END");
//        System.out.println(name + ": " + track.toString() + " " + distance + "%");
//
//    }
//    //    private static final int TRACK_LENGTH = 100;
////    private static boolean hasWinner = false;
////    private String name;
////
////    public Runner(String name) {
////        this.name = name;
////    }
////
////    @Override
////    public void run() {
////        int distance = 0;
////
////        // Run until reaching the finish line
////        while (distance < TRACK_LENGTH && !hasWinner) {
////            // Advance a random amount (1-5 units)
////            int step = (int) (Math.random() * 5) + 1;
////            distance += step;
////
////            // Print progress
////            printProgress(distance);
////
////            // Check if this runner won
////            if (distance >= TRACK_LENGTH && !hasWinner) {
////                hasWinner = true;
////                System.out.println("\n🏆 " + name + " has won the race! 🏆");
////                System.out.println("Race is over. Other runners will stop.");
////            }
////
////            // Simulate different running speeds
////            try {
////                Thread.sleep((int) (Math.random() * 200));
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
////    }
////
////    // Visualize the runner's progress on the track
////    private void printProgress(int distance) {
////        StringBuilder track = new StringBuilder();
////
////        // Create a visual representation of the track
////        for (int i = 0; i < TRACK_LENGTH; i++) {
////            if (i == Math.min(distance, TRACK_LENGTH - 1)) {
////                track.append(name.charAt(0)); // Runner's position
////            } else {
////                track.append("-");
////            }
////        }
////
////        // Add finish line
////        track.append("🏁");
////
////        System.out.println(name + ": " + track.toString() + " " + distance + "%");
////    }
//}