import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class Client3_1 {
    public static void main(String argv[]) throws Exception{

        while (true) {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            String message = input.readLine();
            if (message.equals(".")) break;
            dataOutputStream.writeBytes(message + '\n');
            System.out.println(bufferedReader.readLine());
            socket.close();
        }

    }
}