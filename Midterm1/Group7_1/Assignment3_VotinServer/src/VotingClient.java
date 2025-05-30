import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class VotingClient {
    static final int SERVER_PORT = 9000;
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", SERVER_PORT)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.println(in.readLine());

            while (true) {
                System.out.println("Enter your choice (1-4):");
                String userGuess = scanner.nextLine();

                out.println(userGuess);

                String serverResponse = in.readLine();
                System.out.println("Server: " + serverResponse);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}