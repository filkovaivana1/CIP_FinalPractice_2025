import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String logFile = "log2.txt";

        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;
            String[] parts = input.split(" ", 2);
            String command = parts[0];

            try {
                switch (command) {
                    case "log":
                        if (parts.length < 2) {
                            System.out.println("Error: Missing message");
                            break;
                        }
                        if (!(new File(logFile)).exists()) {
                            System.out.println("File does not exist, so we will create the file");
                            Path path = Paths.get(logFile);
                            Files.createFile(path);
                            System.out.println("File successfully created");
                        }

                        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true), true);
                        printWriter.println(parts[1]);
                        System.out.println("Finished writing log message to file");
                        break;
                    case "read":
                        if (!(new File(logFile)).exists()) {
                            System.out.println("File does not exist");
                            break;
                        }
                        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(logFile));
                        String message;
                        while ((message = bufferedReader.readLine())!=null) {
                            System.out.println(message);
                        }
                        break;

                    case "clear":
                        if (!(new File(logFile)).delete()) {
                            System.out.println("File does not exist or file already cleared");
                        }  else {
                            System.out.println("File successfully cleared");
                        }
                        break;
                    default:
                        System.out.println("Unknown command");
                }
            } catch (IOException e) {
                System.out.println("Error happened while working with file");
            }

        }
        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        String logFile = "log1.txt";
//
//        while (true) {
//            System.out.println("Enter a command: ");
//            String input = scanner.nextLine();
//            if (input.equalsIgnoreCase("end")) break;
//            String[] parts = input.split(" ", 2);
//            String command = parts[0];
//
//            try {
//                switch (command) {
//                    case "log":
//                        if (parts.length < 2) {
//                            System.out.println("Error: missing message");
//                            break;
//                        }
//                        if (!(new File(logFile)).exists()) {
//                            Path filePath = Paths.get(logFile);
//                            Files.createFile(filePath);
//                            System.out.println("File log1.txt created");
//                        }
//                        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true), true);
//                        printWriter.println(parts[1]);
//                        System.out.println("Message logged");
//                        break;
//                    case "read":
//                        File file = new File(logFile);
//                        if (!file.exists()) {
//                            System.out.println("Error: File does not exist");
//                            break;
//                        }
//                        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
//                        String line;
//                        while ((line = bufferedReader.readLine()) != null) {
//                            System.out.println(line);
//                        }
//                        break;
//                    case "clear":
//                        if (!(new File(logFile)).delete()) {
//                            System.out.println("Error: File does not exist or already cleared");
//                        } else {
//                            System.out.println("File cleared successfully");
//                        }
//                        break;
//                    default:
//                        System.out.println("No such command");
//                }
//            } catch (IOException e) {
//                System.out.println("Error happened while working with file");
//            }
//        }
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        String logFile = "log.txt";
//
//        while(true) {
//            System.out.println("Enter command: ");
//            String input = scanner.nextLine();
//
//            if (input.equalsIgnoreCase("exit")) break;
//
//            String[] parts = input.split(" ", 2);
//            String command = parts[0];
//
////            try {
//                switch (command) {
//                    case "log":
//                        if (parts.length < 2) {
//                            System.out.println("Error: Message required");
//                            break;
//                        }
//                        if (!new File(logFile).exists()) {
//                            System.out.println("Error: specified file does not exist");
//                            break;
//                        }
//                        PrintWriter printWriter = new PrintWriter(new FileWriter(logFile, true), true);
//                        System.out.println("Message log t write: " + parts[1]);
//                        printWriter.println(parts[1]);
//                        System.out.println("Message logged");
//                        break;
//                    case "read":
//                        String message;
//                        File file = new File(logFile);
//                        if (!file.exists()) {
//                            System.out.println("Error: FIle not found");
//                            break;
//                        }
//                        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
//                        while ((message = bufferedReader.readLine()) != null) {
//                            System.out.println(message);
//                        }
//                        break;
//                    case "clear":
//                        if ((new File(logFile)).delete())
//                            System.out.println("File cleared");
//                        else
//                            System.out.println("Error: File not found or already cleared");
//                        break;
//                    default:
//                        System.out.println("Unknown command");
//                }
////            } catch (IOException e) {
////                System.out.println("Error happened while working with file");
////            }
//        }
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//        String logFile = "log.txt";
//
//        while (true) {
//            System.out.print("Enter command: ");
//            String input = scanner.nextLine().trim();
//            if (input.equals("exit")) break;
//
//            String[] parts = input.split(" ", 2);
//            String command = parts[0];
//
//            try {
//                switch (command) {
//                    case "log":
//                        if (parts.length < 2) {
//                            System.out.println("Error: Message required");
//                            break;
//                        }
//                        try (FileWriter writer = new FileWriter(logFile, true)) {
//                            writer.write(parts[1] + "\n");
//                            System.out.println("Message logged");
//                        }
//                        break;
//
//                    case "read":
//                        File file = new File(logFile);
//                        if (!file.exists()) {
//                            System.out.println("Error: File not found");
//                            break;
//                        }
//                        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
//                            System.out.println("Content:");
//                            String line;
//                            while ((line = reader.readLine()) != null) {
//                                System.out.println(line);
//                            }
//                        }
//                        break;
//
//                    case "clear":
//                        if (new File(logFile).delete()) {
//                            System.out.println("File cleared");
//                        } else {
//                            System.out.println("Error: File not found or already cleared");
//                        }
//                        break;
//
//                    default:
//                        System.out.println("Error: Unknown command");
//                }
//            } catch (IOException e) {
//                System.out.println("Error: Cannot write to file");
//            }
//        }
//        scanner.close();
    }
}