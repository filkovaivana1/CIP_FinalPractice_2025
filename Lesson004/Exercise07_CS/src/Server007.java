import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server007 {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket connectionSocket = serverSocket.accept();

        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("numbers.txt", true)), true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());

        dataOutputStream.writeBytes("Enter the number of elements" + '\n');
        int size = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[size];
        dataOutputStream.writeBytes("Enter the elements: " + '\n');

        for (int i=0; i<size; i++) {
           array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < size; i++) {
            for (int j=size-1; j>i; j--){
                if(array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }

        dataOutputStream.writeBytes("After sorting array looks like this: " + '\n');
        for (int i=0; i<size; i++) {
            dataOutputStream.writeBytes(array[i] + "" + '\n');
            printWriter.println(array[i]);
        }



        connectionSocket.close();

    }
}