import java.net.*;
import java.io.*;
public class Client8{
    public static void main(String args[])throws Exception{
        Socket socket = new Socket("localhost", 8080);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileInput = new BufferedReader(new FileReader("numbers.txt"));
        int counter = 0;
        System.out.println(bufferedReader.readLine());

        String num;
        int[] array = new int[100];
        while((num = fileInput.readLine()) != null) {
            array[counter] = Integer.parseInt(num);
            counter++;
        }

        dataOutputStream.writeBytes(counter + "" + '\n');
        for (int i = 0; i < counter; i++) {
            dataOutputStream.writeBytes(array[i] + "" + '\n');
        }

        System.out.println(bufferedReader.readLine());

        System.out.println(bufferedReader.readLine());
        System.out.println();
//        for (int i=0; i<size; i++) {
//            System.out.print(bufferedReader.readLine() + " ");
//        }
        System.out.print(bufferedReader.readLine());


        socket.close();


        //        Socket socket = new Socket("localhost", 8080);
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("numbers.txt"));
//
//        String s;
//        String message;
//        int[] arr = new int[100];
//        int num = 0;
//
//        while ((s = bufferedReader1.readLine()) != null) {
//            arr[num] = Integer.parseInt(s);
//            num++;
//        }
//
//        dataOutputStream.writeBytes("Hello server! " + '\n');
//        dataOutputStream.writeBytes(num + "" + '\n');
//
//        for (int i=0; i<num; i++) {
//            dataOutputStream.writeBytes(arr[i] + "" + '\n');
//        }
//
//        message = bufferedReader.readLine();
//        System.out.println(message);
//        for (int i=0; i<num; i++) {
//            System.out.print(bufferedReader.readLine() + ", ");
//            }
//
//        System.out.println();
//        socket.close();
//        bufferedReader.close();
//        bufferedReader1.close();

    }
}