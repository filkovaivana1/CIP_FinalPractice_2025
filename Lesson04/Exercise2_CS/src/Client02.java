import java.io.*;
import java.net.Socket;

public class Client02 {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 8080);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input string: ");
        String message = input.readLine();
        dataOutputStream.writeBytes(message + '\n');
        System.out.println(bufferedReader.readLine());

    }
}
