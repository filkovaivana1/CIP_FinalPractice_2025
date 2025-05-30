import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        String fileName = "log.txt";


        while (true) {
            System.out.println("ENter command");
           String inputCommand = input.nextLine();
           if (inputCommand.equalsIgnoreCase("EXIT")) {
               System.out.println("Ending loop");
               break;
           }
           String[] parts = inputCommand.split(" ",2);
           String command = parts[0];

           try {
               switch (command) {
                   case "log":
                       if (parts.length < 2) {
                           System.out.println("Invalid log message, missing message");
                           break;
                       }
                       File file = new File(fileName);
                       if (!file.exists()) {
                           System.out.println("File does not exist, so now we create the file");
                           Path path = Paths.get(fileName);
                           Files.createFile(path);
                           System.out.println("File was successfully crated");
                       }

                       PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true), true);
                       printWriter.println(parts[1]);
                       break;
                   case "read":
                       if (!(new File(fileName)).exists()) {
                           System.out.println("File does not exist");
                           break;
                       }
                       BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                       String line;
                       while ((line = bufferedReader.readLine())!=null) {
                           System.out.println(line);
                       }

                       break;
                   case "clear":
                        if (!(new File(fileName)).exists()) {
                            System.out.println("File does not exist, or already empty");

                        } else {
                            (new File(fileName)).delete();
                            System.out.println("File was successfully deleted");
                        }

                       break;
                   default:
                       System.out.println("No such command");
               }

           } catch (IOException e) {
               System.out.println("Error happened while working with file");
           }
        }

    }
}