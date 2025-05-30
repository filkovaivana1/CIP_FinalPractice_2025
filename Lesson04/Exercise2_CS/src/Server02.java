import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Server02 {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);

        while(true) {
            Socket connectionSocket = serverSocket.accept();

            DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            String message = bufferedReader.readLine();
            String modified = message.toUpperCase();
            dataOutputStream.writeBytes(modified + '\n');
            connectionSocket.close();
        }

    }
}