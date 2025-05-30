import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client007 {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket( "localhost", 8080);

        BufferedReader input = new BufferedReader(new FileReader("numbers.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        System.out.println(bufferedReader.readLine());
        int size = 0;
        String num;
        int[] array = new int[100];
        while ((num = input.readLine())!=null) {
            array[size] = Integer.parseInt(num);
            size++;
        }

        dataOutputStream.writeBytes(size + "" + '\n');
        System.out.println(bufferedReader.readLine());
        for (int i=0; i<size; i++) {
            dataOutputStream.writeBytes(array[i] + "" + '\n');
        }

        System.out.println(bufferedReader.readLine());
        for (int i=0; i<size; i++) {
            System.out.print(bufferedReader.readLine() + " ");
        }

        socket.close();
    }
}
