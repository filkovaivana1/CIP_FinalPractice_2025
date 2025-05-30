import java.net.*;
import java.io.*;
public class Client7{
    public static void main(String a[])throws Exception{

        Socket socket = new Socket("localhost", 8080);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(bufferedReader.readLine());
        int size = Integer.parseInt(input.readLine());
        dataOutputStream.writeBytes(size + "" + '\n');

        System.out.println(bufferedReader.readLine());

        for (int i=0; i<size; i++) {
            dataOutputStream.writeBytes(input.readLine() + '\n');
        }

        System.out.println(bufferedReader.readLine());
        System.out.println();
//        for (int i=0; i<size; i++) {
//            System.out.print(bufferedReader.readLine() + " ");
//        }
        System.out.print(bufferedReader.readLine());


        socket.close();


        //        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        Socket x = new Socket("127.0.0.1", 8080);
//
//        DataOutputStream dataOutputStream = new DataOutputStream(x.getOutputStream());
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(x.getInputStream()));
//
//        String message;
//        int num;
//
//        message = bufferedReader.readLine();
//        System.out.println(message);
//
//        message = input.readLine();
//        dataOutputStream.writeBytes(message + '\n');
//        num = Integer.parseInt(message);
//
//        System.out.println(bufferedReader.readLine());
//        for (int i=0; i<num; i++) {
//           dataOutputStream.writeBytes(input.readLine() + '\n');
//        }
//
//        System.out.print(bufferedReader.readLine());
//        System.out.println();
//        for (int i=0; i<num; i++) {
//            System.out.print(bufferedReader.readLine() + " ");
//        }
//        x.close();
//

    }
}