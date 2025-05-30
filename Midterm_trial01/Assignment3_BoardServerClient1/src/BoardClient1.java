import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class BoardClient1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(
        Socket socket = new Socket("localhost", 8080);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            System.out.println(bufferedReader.readLine());
            while (true) {
                String commandInput = scanner.nextLine();
                printWriter.println(commandInput);
                if (commandInput.equalsIgnoreCase("END")) break;

                String response;
                while ((response = bufferedReader.readLine()) != null && !response.equalsIgnoreCase("Enter command: ")) {
                    System.out.println(response);
                }
                if (response != null && response.equalsIgnoreCase("Enter command: "))
                {
                    System.out.println(response);
                }
            }
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: Server unavailable");
        }
//        Scanner scanner = new Scanner(System.in);
//
//            try {
//                Socket socket = new Socket("localhost", 8080);
//                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                System.out.println(bufferedReader.readLine());
//
//                while (true) {
//                    System.out.print(">");
//                    String commandInput = scanner.nextLine();
//                    if (commandInput.equalsIgnoreCase("end")) {
//                        System.out.println("Bye");
//                        break;
//                    }
//                    printWriter.println(commandInput);
//
//                    String result;
//                    while ((result = bufferedReader.readLine())!=null && !result.equalsIgnoreCase("Enter command: ")) {
//                        System.out.println(result);
//                    }
//                  if (result != null && result.equalsIgnoreCase("Enter command: ")) {
//                      System.out.println(result);
//                  }
//                }
//
//                socket.close();
//
//            } catch (IOException e) {
//                System.out.println("Error: server unavailable");
//            }

//        try {
//            Socket socket = new Socket("localhost", 8080);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
//            Scanner scanner = new Scanner(System.in);
//            System.out.println(bufferedReader.readLine());
//
//            while (true)
//            {
//
//                System.out.println(">");
//                String command = scanner.nextLine();
//                printWriter.println(command);
//                if (command.equalsIgnoreCase("EXIT")) break;
////                System.out.println(bufferedReader.readLine());
//
//
//
//                String response;
//                while ((response = bufferedReader.readLine()) != null && !response.equalsIgnoreCase("Enter command: ")) {
//                    System.out.println(response);
//                }
//
//
//            }
//            socket.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
