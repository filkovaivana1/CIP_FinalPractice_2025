import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 8080);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        printWriter.println("Hello server");
        System.out.println(bufferedReader.readLine());

        System.out.println(bufferedReader.readLine());
        int num1 = Integer.parseInt(input.readLine());
        printWriter.println(num1);

        System.out.println(bufferedReader.readLine());
        int num2 = Integer.parseInt(input.readLine());
        printWriter.println(num2);

        System.out.println(bufferedReader.readLine());


        socket.close();
    }
}
