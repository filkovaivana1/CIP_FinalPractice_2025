import java.io.*;
import java.net.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BoardServer {

    private static Map<String, List<String>> messages = new HashMap<>();

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started at port 8080");

            while (true) {
                try (Socket connectionSocket = serverSocket.accept();
                     PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()), true);
                     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()))) {

                    String clientIP = connectionSocket.getInetAddress().getHostAddress();
                    System.out.println("Client connected:" + clientIP);

                    printWriter.println("Enter command: ");
                    String inputCommand;
                    while ((inputCommand = bufferedReader.readLine()) != null) {

                        String[] parts = inputCommand.split(" ", 3);
                        String command = parts[0];

                        switch (command) {
                            case "post":
                                if (parts.length < 3) {
                                    System.out.println("Error: invalid post command");
                                    break;
                                }
                                String hashtag = parts[1];
                                String message = parts[2];
                                String localDateTime = LocalDateTime.now().toString();
                                messages.computeIfAbsent(hashtag, k -> new ArrayList<>()).add("[" + localDateTime + "]: " + message);
                                System.out.println("Posted " + hashtag + " " + message);
                                printWriter.println("Message posted");
                                break;
                            case "read":
                                if (parts.length < 2) {
                                    printWriter.println("Error: invalid read command");
                                    break;
                                }
                                hashtag = parts[1];
                                List<String> messList = messages.getOrDefault(hashtag, Collections.emptyList());
                                if (messList.isEmpty()) {
                                    printWriter.println("No messages found");
                                } else {
                                    for (String mess : messList) {
                                        printWriter.println(mess);
                                    }
                                }
                                System.out.println("Finished reading messages fro hashtag: " + hashtag);
                                break;
                            case "bye":
                                System.out.println("Client disconnected");
                                return;
                            default:
                                printWriter.println("Unknown command");
                        }
                        printWriter.println("Enter command: ");
                    }

                } catch (IOException e) {
                    System.out.println("Error: Client connection failed");
                }

            }
        } catch (IOException e) {
            System.out.println("Error: Server failed to start");
        }


    }
}