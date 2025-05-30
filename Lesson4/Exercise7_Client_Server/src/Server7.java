import javax.xml.crypto.Data;
import java.net.*;
import java.io.*;
public class Server7{
    public static void main(String a[])throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket connectionSocket = serverSocket.accept();

        DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

        dataOutputStream.writeBytes("Enter number of elements: " + '\n');
        int size = Integer.parseInt(bufferedReader.readLine());

        dataOutputStream.writeBytes("Enter the numbers: " + '\n');

        int[] array = new int[size];

        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < size; i++) {
            for (int j=size-1; j>i; j--) {
                if (array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }

        dataOutputStream.writeBytes("After sorting array looks like this: " + '\n');
        for (int i=0; i < size; i++) {
            dataOutputStream.writeBytes(array[i] + " ");
        }

//        for (int i=0; i < size; i++) {
//            dataOutputStream.writeBytes(array[i] + "" + '\n');
//        }

        connectionSocket.close();
//        ServerSocket serverSocket = new ServerSocket(8080);
//        Socket connectionSocket = serverSocket.accept();
//
//        DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//
//        dataOutputStream.writeBytes("Input the num of elements: " + '\n');
//        int number = Integer.parseInt(bufferedReader.readLine());
//
//        int[] arr = new int[number];
//        dataOutputStream.writeBytes("Input the elements: " + '\n');
//        for (int i=0; i<number; i++) {
//           arr[i] = Integer.parseInt(bufferedReader.readLine());
//        }
//
//        for (int i=0; i< number; i++) {
//            for (int j=number-1; j>i; j--) {
//                if (arr[j] < arr[j-1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = tmp;
//                }
//            }
//
//        }
//        dataOutputStream.writeBytes("After sorting tje list looks like this: " + '\n');
//
//        for (int i=0; i<number; i++) {
//            dataOutputStream.writeBytes(arr[i] + "" + '\n');
//        }
    }
}