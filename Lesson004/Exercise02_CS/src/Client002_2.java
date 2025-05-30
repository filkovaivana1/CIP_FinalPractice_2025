import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client002_2 {
    public static void main(String[] args) throws  Exception {

        while (true) {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            System.out.println(bufferedReader.readLine());
            String message = input.readLine();
            if(message.equalsIgnoreCase(".")) break;
            dataOutputStream.writeBytes(input.readLine() + '\n');
            System.out.println(bufferedReader.readLine());
            socket.close();
//            input.close();
//            bufferedReader.close();
//            dataOutputStream.close();
        }
    }
}