import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int PORT = 9000;
    static ArrayList questions = new ArrayList();
    static ArrayList answers = new ArrayList();
    static ArrayList correctAnswers = new ArrayList();

    public static void main(String[] args) {
        questions.add("Question 1: What is the capital of France?");
        questions.add("Question 2: What is 2 + 2?");
        questions.add("Question 3: What is the programming language we are using?");

        answers.add("1. Paris \n2. Berlin \n3. Rome \n4. Madrid");
        answers.add("1. 3 \n2. 4 \n3. 5 \n4. 6");
        answers.add("1. Python \n2. C++ \n3.Java \n4. JavaScript");

        correctAnswers.add("Paris");
        correctAnswers.add("4");
        correctAnswers.add("Java");



        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Quiz server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected " + clientSocket.getInetAddress());

                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            System.out.println("Error: Could not connect to server");
        }

    }

    static class ClientHandler extends Thread {
        Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 Scanner scanner = new Scanner(System.in);
            ) {

                out.println("Welcome to the Quiz");
                System.out.println("Enter your choice (1-4):");

                String clientGuess;

                while ((clientGuess = in.readLine()) != null) {
                    if (clientGuess.equalsIgnoreCase("exit")) {
                        out.println("Game ended");

                        break;
                    }

                    for (int i = 0; i < questions.size(); i++) {
                        System.out.println("test");
                        //System.out.println(questions.get(i));
                        //System.out.println(answers.get(i));

                        System.out.println("Enter your choice (1-4):");

                        String userGuess = scanner.nextLine();

                        if (userGuess.equalsIgnoreCase((String) correctAnswers.get(i))) {
                            System.out.println("Sever says: Correct!");
                        }

                        else {
                            System.out.println("Sever says: Incorrect!");
                        }
                    }


                }

                System.out.println("Game ended. Client disconnected.");
                socket.close();

            } catch (IOException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
            }

        }
    }
}