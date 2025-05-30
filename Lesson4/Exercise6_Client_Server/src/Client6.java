import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client6{
    public static void main(String [] a)throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Socket socket = new Socket("127.0.0.1", 8080);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

            String inputOperation = input.readLine();
            dataOutputStream.writeBytes( inputOperation+ '\n');

            if (inputOperation.equalsIgnoreCase("END")) break;
            System.out.println(bufferedReader.readLine());
            dataOutputStream.writeBytes(input.readLine() + '\n');

            System.out.println(bufferedReader.readLine());
            dataOutputStream.writeBytes(input.readLine() + '\n');

            System.out.println(bufferedReader.readLine());
            socket.close();
        }

        //        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//        while(true){
//            Socket x = new Socket("127.0.0.1", 8080);
//            DataOutputStream to = new DataOutputStream(x.getOutputStream());
//            BufferedReader from = new BufferedReader(new InputStreamReader(x.getInputStream()));
//            String message, message2;
//
//            System.out.println("*******************************\n\n\n\n");
//            message = from.readLine();
//            System.out.println(message);
//            message = from.readLine();
//            System.out.println(message);
//
//            System.out.print("->");
//            message2 = input.readLine();
//            to.writeBytes(message2 + '\n');
//            if(message2.equalsIgnoreCase("end")) break;
//
//            message = from.readLine();
//            System.out.println(message);
//            System.out.print("->");
//            to.writeBytes(input.readLine() + '\n');
//
//            message = from.readLine();
//            System.out.println(message);
//            System.out.print("->");
//            to.writeBytes(input.readLine() + '\n');
//
//            message = from.readLine();
//            System.out.println(message);
//            x.close();
//        }
    }
}