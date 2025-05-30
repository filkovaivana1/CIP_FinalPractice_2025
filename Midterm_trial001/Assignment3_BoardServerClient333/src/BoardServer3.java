import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class BoardServer3 {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<>();

        try (ServerSocket serverSocket = new ServerSocket(8080)){
            System.out.println("Server started working");


            while(true) {
                try (Socket connectionSocket = serverSocket.accept()) {
                    System.out.println("Client connected");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()), true);

                    printWriter.println("Enter command: ");


                    String commantInput;
                    while ((commantInput = bufferedReader.readLine())!=null) {
                        String[] parts = commantInput.split(" ", 3);
                        String command = parts[0];

                        switch (command) {
                            case "post":
                                if (parts.length != 3) {
                                    printWriter.println("Invalid post command");
                                    break;
                                }
                                String hashtag = parts[1];
                                String message = parts[2];

                                hashMap.computeIfAbsent(hashtag, p -> new ArrayList<>()).add(message);
                                printWriter.println("Post message saved fir hashtag");
                                break;

                            case "read":
                                if (parts.length != 2) {
                                    printWriter.println("Invalid read command");
                                    break;
                                }

                                List<String> messages = hashMap.getOrDefault(parts[1], Collections.emptyList());
                                for (String  msg : messages) {
                                    printWriter.println(msg);
                                }
                                printWriter.println("REading finished");
                                break;

                            case "bye":
                                printWriter.println("Bye");
                                connectionSocket.close();
                                break;
                            default:
                                printWriter.println("No such command");
                        }
                        printWriter.println("Enter command: ");

                    }

                } catch (IOException e) {
                    System.out.println("Client got disconnected");
                }
            }
        } catch (IOException e) {
            System.out.println("Server can not be started");
        }
    }
}