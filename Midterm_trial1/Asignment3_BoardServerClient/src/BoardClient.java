import java.io.*;
import java.net.*;
import java.security.PrivateKey;
import java.util.Scanner;

public class BoardClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(bufferedReader.readLine());
            Scanner input = new Scanner(System.in);

            while(true) {
                System.out.println(">");
               String commandInput = input.nextLine();
               if (commandInput.equalsIgnoreCase("bye")) {
                   System.out.println("Bye");
                   break;
               }

                printWriter.println(commandInput);

               String response;
               while ((response = bufferedReader.readLine()) != null && !response.equalsIgnoreCase("Enter command: ")){
                   System.out.println(response);
               }


            }


        } catch (IOException e) {
            System.out.println("Error: Server unavailable");
        }
//        try (Socket socket = new Socket("localhost", 8080);
//             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
//
//            System.out.println("Connected to server");
//            Scanner scanner = new Scanner(System.in);
//            String serverPrompt = in.readLine(); // Read initial prompt
//
//            while (true) {
//                System.out.print("> "); // Client prompt
//                String input = scanner.nextLine().trim();
//
//                if (input.equals("bye")) {
//                    out.println("bye");
//                    break;
//                }
//
//                out.println(input);
//                String response;
//                while ((response = in.readLine()) != null && !response.equals("Enter command:")) {
//                    System.out.println(response);
//                }
//            }
//            System.out.println("Disconnected from server");
//            scanner.close();
//        } catch (IOException e) {
//            System.out.println("Error: Server unavailable");
//        }
    }
}