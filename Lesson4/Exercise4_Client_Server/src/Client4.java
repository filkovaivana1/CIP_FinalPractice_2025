import java.io.*;
import java.net.*;
class Client4 {
    public static void main(String argv[]) throws Exception{
        while (true) {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            String message = input.readLine();
            dataOutputStream.writeBytes(message + '\n');
            if (message.equalsIgnoreCase("END")) break;
            System.out.println(bufferedReader.readLine());
            socket.close();
        }

        //        String message;
//        String modifiedMessage;
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//            Socket clientSOcket = new Socket("127.0.0.1", 8080);
//            DataOutputStream dataOutputStream = new DataOutputStream(clientSOcket.getOutputStream());
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSOcket.getInputStream()));
//
//            System.out.println("Enter some message. Input END to finish");
//            message = input.readLine();
//            dataOutputStream.writeBytes(message + '\n');
//            if (message.equalsIgnoreCase("END")) {
//                break;
//            }
//            modifiedMessage = bufferedReader.readLine();
//            System.out.println("MOdified message from server: " + modifiedMessage);
//            clientSOcket.close();
//        }

    }
}