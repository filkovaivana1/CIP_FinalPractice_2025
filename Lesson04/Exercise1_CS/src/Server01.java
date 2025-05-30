import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01{
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket connectionSocket = serverSocket.accept();

        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

        String message = bufferedReader.readLine();
        System.out.println(message);

        printWriter.println("HEllo client!");

        printWriter.println("Input first num:");
        int num1 = Integer.parseInt(bufferedReader.readLine());

        printWriter.println("Input second num:");
        int num2 = Integer.parseInt(bufferedReader.readLine());

        int result = num1 + num2;
        printWriter.println(result);


        connectionSocket.close();

    }
}