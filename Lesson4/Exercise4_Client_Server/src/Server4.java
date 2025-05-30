import java.io.*;
import java.net.*;
class Server4 {
    public static void main(String argv[]) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {

            Socket connectionSocket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());

            dataOutputStream.writeBytes("Enter message: " + '\n');
            dataOutputStream.writeBytes("Enter 'END' to finish " + '\n');
            String message = bufferedReader.readLine();
            if (message.equalsIgnoreCase("END")) System.exit(0);
            String modifiedMessage = message.toUpperCase();
            dataOutputStream.writeBytes("Modified message: " + modifiedMessage + '\n');
            connectionSocket.close();
            dataOutputStream.close();
            bufferedReader.close();
        }

        //        String clientMessage;
//        String uppercaseMessage;
//        ServerSocket socket = new ServerSocket(8080);
//
//        while (true) {
//            Socket connectionSocket = socket.accept();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//            DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());
//            clientMessage = bufferedReader.readLine();
//            System.out.println(clientMessage);
//            if(clientMessage.equalsIgnoreCase("END")) {
//                System.exit(0);
//            }
//            uppercaseMessage = clientMessage.toUpperCase();
//            dataOutputStream.writeBytes(uppercaseMessage + '\n');
//        }

    }
} 