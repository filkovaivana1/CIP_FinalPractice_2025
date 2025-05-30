import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server002 {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket connectionSocket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());

        dataOutputStream.writeBytes("Enter some string: " + '\n');
        String message = bufferedReader.readLine();

        String modifiedMessage = message.toUpperCase();
        dataOutputStream.writeBytes(modifiedMessage);
        connectionSocket.close();
        bufferedReader.close();
        dataOutputStream.close();

    }
}
