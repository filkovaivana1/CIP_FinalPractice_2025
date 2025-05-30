import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server08 {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter1 = new PrintWriter(new BufferedWriter(new FileWriter("numbers.txt", true)),true);


        printWriter.println("Enter the number of elements in the array: ");
        int size = Integer.parseInt(bufferedReader.readLine());
        System.out.println(size);
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++){
            printWriter.println("Enter the number for position " + i + ": ");
            arr[i] = Integer.parseInt(bufferedReader.readLine());

        }
        int temp;
        for(int i = 0 ; i < size; i++){
            for (int j = size - 1; j > i ; j--){
                if (arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }

        for (int i = 0 ; i < size ; i++){
            printWriter.println(arr[i]);
            printWriter1.println(arr[i]);
        }

        socket.close();
    }
}