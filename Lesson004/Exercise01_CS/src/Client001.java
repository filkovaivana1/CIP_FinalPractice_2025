import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client001 {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 8080);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        printWriter.println("Hello server");
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

       int number1 = Integer.parseInt(input.readLine());
       int number2 = Integer.parseInt(input.readLine());

       printWriter.println(number1);
       printWriter.println(number2);

        System.out.println(bufferedReader.readLine());
        socket.close();
        bufferedReader.close();
        printWriter.close();
    }
}
