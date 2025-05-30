import java.util.Scanner;

public class ParallelReader22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ENter command");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) break;
            String[] parts = input.split(" ", 3);
            String command = parts[0];
            if (!command.equalsIgnoreCase("read") || parts.length != 3) {
                System.out.println("INvald read command");
                continue;
            }

            FileReaderTask fileReaderTask1 = new FileReaderTask(parts[1]);
            FileReaderTask fileReaderTask2 = new FileReaderTask(parts[2]);

            fileReaderTask1.start();
            fileReaderTask2.start();

            try {
                fileReaderTask1.join();
                fileReaderTask2.join();
            } catch (InterruptedException e) {}
            System.out.println("Reading finished");
        }
    }
}