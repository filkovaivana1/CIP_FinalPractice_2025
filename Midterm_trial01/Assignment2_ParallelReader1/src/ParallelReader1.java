import java.util.Scanner;

public class ParallelReader1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ENter command");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) break;
            String[] parts = input.split(" ", 3);
            if (!parts[0].equalsIgnoreCase("read") || parts.length<3) {
                System.out.println("INvalid message");
                continue;
            }

            FileReaderTask fileReaderTask1 = new FileReaderTask(parts[1]);
            FileReaderTask fileReaderTask2 = new FileReaderTask(parts[2]);

            fileReaderTask2.start();
            fileReaderTask1.start();

            try {
                fileReaderTask1.join();
                fileReaderTask2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Reading from both files finished");


        }

    }
}