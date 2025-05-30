import java.io.*;
import java.net.*;
class Client3 {
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


        //        String message;
//        String modifiedMessage;
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//        while(true) {
//            Socket clientSocket = new Socket("127.0.0.1", 8080);
//            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            System.out.println("ENter something. To exit enter \".\"");
//            message = input.readLine();
//
//            if (message.equals(".")) break;
//            dataOutputStream.writeBytes(message + '\n');
//            modifiedMessage = bufferedReader.readLine();
//            System.out.println("MOdified message from server: " + modifiedMessage);
//            clientSocket.close();
//        }


    }
}