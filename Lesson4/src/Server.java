import java.net.*;
import java.io.*;
import java.security.PrivateKey;

public class Server{
    public static void main(String[] a) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8080);
    Socket connectionSocket = serverSocket.accept();

    PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()),true);
   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

   String message = bufferedReader.readLine();
   System.out.println(message);

   printWriter.println("Hello client, please enter two numbers: ");
   int number1 = Integer.parseInt(bufferedReader.readLine());
   int number2 = Integer.parseInt(bufferedReader.readLine());

   int result = number1 + number2;
   printWriter.println(number1 + " + " + number2 + " = " + result);

        //        ServerSocket serverSocket = new ServerSocket(8080);
//        Socket socket = serverSocket.accept();
//        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//        System.out.println("A message from the client: " + bufferedReader.readLine());
//        printWriter.println("Hello client");
//        int number1 = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("THe first number obtained from client:" + number1);
//
//        int number2 = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("THe second number obtained from client:" + number2);
//
//        int sum = number1 + number2;
//        printWriter.println(sum);
//        System.out.println("Result sent to client: " + sum);
//        bufferedReader.close();
//        printWriter.close();

    }


}