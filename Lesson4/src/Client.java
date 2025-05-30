import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8080);

        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        printWriter.println("Hello server!");
        System.out.println(bufferedReader.readLine());

        System.out.println("Enter number1: ");
        printWriter.println(input.readLine());

        System.out.println("Enter number2: ");
        printWriter.println(input.readLine());

        System.out.println(bufferedReader.readLine());
        //        String server = "localhost";
//        int port = 8080;
//        Socket client = new Socket(server, port);
//        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
//
//        printWriter.println("Hello server");
//        String answer = bufferedReader.readLine();
//        System.out.println("A message from the server: " + answer);
//
//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Input the first number");
//        String input1 = bufferedReader1.readLine();
//        printWriter.println(input1);
//
//        System.out.println("Input the second number: ");
//        String input2 = bufferedReader1.readLine();
//        printWriter.println(input2);
//
//        answer = bufferedReader.readLine();
//        System.out.println("THe server has calculated that " + input1 + " + " + input2 + " = " + answer);
//        bufferedReader.close();
//        printWriter.close();
//        client.close();

    }
}
