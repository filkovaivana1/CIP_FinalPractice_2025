import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.*;

public class BoardServer1 {

    public static Map<String, List<String>> hashmap = new HashMap<>();

    public static void main(String[] args) {

        try(ServerSocket socket = new ServerSocket(8080)){
            System.out.println("Server started");
            while (true) {
                try (Socket connectionSocket = socket.accept();
                     PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()), true);
                     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                ) {
                    printWriter.println("Enter command: ");
                    String commandInput;
                    while((commandInput = bufferedReader.readLine())!= null) {

                        String[] parts = commandInput.split(" ", 3);
                        String command = parts[0];
                        switch (command) {
                            case "post":
                                if (parts.length < 3) {
                                    printWriter.println("Invalid post command");
                                    break;
                                }
                                String hashtag = parts[1];
                                String message = parts[2];
                                hashmap.computeIfAbsent(hashtag, x -> new ArrayList<>()).add(message);
                                printWriter.println("Post message finished");
                                break;
                            case "read":
                                List<String> messages = hashmap.getOrDefault(parts[1], Collections.emptyList());
                                for (String msg : messages) {
                                    printWriter.println(msg);
                                }
                                printWriter.println("Reading message for hashtag finished");
                                break;
                            case "end":
                                break;
                            default:
                                printWriter.println("No such command");
                        }
                        printWriter.println("Enter command: ");
                    }
                    connectionSocket.close();
                } catch (IOException e) {
                    System.out.println("Connection to client failed");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Server could not start");
        }

//        try {
//            ServerSocket serverSocket = new ServerSocket(8080);
//            System.out.println("Server is listening on port 8080");
//
//            while(true) {
//                Socket connectionSocket = serverSocket.accept();
//                System.out.println("Connected client IP: " + connectionSocket.getInetAddress().getHostAddress());
//
//                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()), true);
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//
//                printWriter.println("Enter command: ");
//                String commandInput;
//                while ((commandInput = bufferedReader.readLine())!= null) {
//
//                    String[] parts = commandInput.split(" ", 3);
//                    String command = parts[0];
//
//                    switch (command) {
//                        case "post":
//                            if (parts.length < 3) {
//                                printWriter.println("Error: Invalid post message");
//                                break;
//                            }
//                            hashmap.computeIfAbsent(parts[1], k -> new ArrayList<>()).add(parts[2]);
//                            printWriter.println("Command is saved in hashmap");
//                            break;
//                        case "read":
//                            if (parts.length < 2) {
//                                printWriter.println("Error: Invalid read command");
//                                break;
//                            }
//                            List<String> messages = hashmap.getOrDefault(parts[1], Collections.emptyList());
//                            for (String msg : messages) {
//                                printWriter.println(msg);
//                            }
//                            printWriter.println("Finished reading commands for hashtag from hashmap");
//                            break;
//                        case "end":
//                            System.out.println("Client disconnected");
//                            break;
//                        default:
//                            printWriter.println("Unknown command");
//                    }
//                    printWriter.println("Enter command: ");
//                }
//                connectionSocket.close();
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            ServerSocket serverSocket = new ServerSocket(8080);
//            System.out.println("The server is listening on port 8080");
//            Socket connectionSocket = serverSocket.accept();
//
//            System.out.println("Client conncted: " + connectionSocket.getInetAddress().getHostAddress().toString());
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()), true);
//
//            while (true) {
//                printWriter.println("Enter command: ");
//
//                String commandInput = bufferedReader.readLine();
//                System.out.println(commandInput);
//                String[] parts = commandInput.split(" ", 3);
//
//                String command = parts[0];
//                switch (command) {
//                    case "post":
//                        if (parts.length < 3) {
//                            System.out.println("Invalid post command");
//                            break;
//                        }
//
//                        LocalDateTime localDateTime = LocalDateTime.now();
//                        hashMap.computeIfAbsent(parts[1], x -> new ArrayList<>()).add(parts[2]);
//                        System.out.println("Post command added");
//                        printWriter.println("Post command added");
//
//                        break;
//                    case "read":
//                        if (parts.length < 2) {
//                            System.out.println("Invalid read command");
//                            break;
//                        }
//
//                        List<String> messages = hashMap.getOrDefault(parts[1], Collections.emptyList());
//                        for (String message: messages) {
//                            System.out.println(message);
//                            printWriter.println(message);
//                        }
//
//                        printWriter.println("Successfully finished reading");
//                        break;
//                    case "end":
//                        break;
//                    default:
//                        System.out.println("No such command");
//                }
//
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}