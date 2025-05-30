/**
 * ThreadRacingExample - Demonstrates the concept of thread racing
 *
 * This program simulates a race between multiple runners (threads) on a track.
 * Each runner advances at random speeds, and the first to reach the finish line wins.
 * This illustrates how threads can execute at unpredictable rates, leading to
 * non-deterministic outcomes in multi-threaded applications.
 */
public class ThreadRacingExample {

    public static void main(String[] args) {
        System.out.println("Thread Racing Demonstration - Race Track");
        System.out.println("========================================");
        System.out.println("Each runner will advance at random speeds.");
        System.out.println("Watch as they race to the finish line!\n");

        // Create multiple runner threads

        Runner runner1 = new Runner("Runner1");
        Runner runner2 = new Runner("Runner2");
        Runner runner3 = new Runner("Runner3");
        Runner runner4 = new Runner("Runner4");

        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();

    }

    // Runner class represents a participant in the race

} 