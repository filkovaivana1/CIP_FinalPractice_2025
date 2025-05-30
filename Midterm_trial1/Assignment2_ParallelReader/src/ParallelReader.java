import java.util.Scanner;

public class ParallelReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            String[] parts = input.split(" ", 3);
            if (!parts[0].equalsIgnoreCase("read") || parts.length < 3) {
                System.out.println("Error: Use 'read <file1> <file2>'");
                continue;
            }
            FileReaderTask fileReaderTask1 = new FileReaderTask(parts[1]);
            FileReaderTask fileReaderTask2 = new FileReaderTask(parts[2]);

            fileReaderTask1.start();
            fileReaderTask2.start();

            try {
                fileReaderTask1.join();
                fileReaderTask2.join();
            } catch (InterruptedException e) {
                System.out.println("Error: thread interrupted!");
            }
            System.out.println("Both threads finished reading the files");

        }

    }
}