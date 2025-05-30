import java.io.*;
import java.net.*;
class Client2 {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 8080);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(bufferedReader.readLine());
        String message = input.readLine();
        dataOutputStream.writeBytes(message + '\n');
        System.out.println(bufferedReader.readLine());




        //            String message;
//            String modifiedMessage;
//            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//            Socket clientSocket = new Socket("localhost", 8080);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
//
//            System.out.println("Enter some input: ");
//            message = input.readLine();
//            dataOutputStream.writeBytes(message + '\n');
//            modifiedMessage = bufferedReader.readLine();
//            System.out.println("Uppercase message from server: " + modifiedMessage);
//            clientSocket.close();
//            bufferedReader.close();
//            dataOutputStream.close();

    }
}