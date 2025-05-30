import java.net.*;
import java.io.*;
public class Server8{
    public static void main(String args[])throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket connectionSocket = serverSocket.accept();

        DataOutputStream dataOutputStream = new DataOutputStream(connectionSocket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("numbers.txt", true)), true);
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
        printWriter.println();
        printWriter.println("After sorting array looks like this: ");
        printWriter.println();
        for (int i=0; i < size; i++) {
            dataOutputStream.writeBytes(array[i] + " ");
            printWriter.println(array[i]);
        }

//        for (int i=0; i < size; i++) {
//            dataOutputStream.writeBytes(array[i] + "" + '\n');
//        }

        connectionSocket.close();

        //        ServerSocket serverSocket = new ServerSocket(8080);
//        Socket socket = serverSocket.accept();
//
//        String message;
//        String s;
//        int[] arr = new int[100];
//        int num;
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("numbers.txt", true)));
//
//        message = bufferedReader.readLine();
//        System.out.println(message);
//        num = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("Num of elements: " + num);
//        printWriter.println("Num of elements: " + num);
//        printWriter.println("Before sorting list looks like this: ");
//
//        for (int i=0; i<num; i++) {
//            s = bufferedReader.readLine();
//            printWriter.print(s + ", ");
//            arr[i] = Integer.parseInt(s);
//        }
//
//        for (int i=0; i<num; i++) {
//            for (int j=num-1; j>i; j--) {
//                if(arr[j]>arr[j-1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = tmp;
//                }
//            }
//        }
//
//        dataOutputStream.writeBytes("After sorting array looks like this:" + '\n');
//        printWriter.println("After sorting array looks like this:");
//        for (int i=0; i<num; i++) {
//            dataOutputStream.writeBytes(arr[i] + "" + '\n');
//            printWriter.print(arr[i] + ", ");
//        }
//
//        socket.close();
//        printWriter.close();

    }
}