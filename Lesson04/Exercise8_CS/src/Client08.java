import java.io.*;
import java.net.Socket;

public class Client08 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8080);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader inputFile = new BufferedReader(new FileReader("numbers.txt"));
        System.out.println(bufferedReader.readLine());
        int n = 0;
        // printWriter.println(n);

        String something;
        int[] arr = new int[100];
        while ((something = inputFile.readLine())!=null){
            arr[n] = Integer.parseInt(something);
            System.out.println("TEST" +arr[n]);
            System.out.println("n = " + n);
            n++;
        }

        printWriter.println(n);

        for(int i=0; i<n; i++){
            System.out.println(bufferedReader.readLine());
            printWriter.println(arr[i]);
        }

        int[] sortedArr = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.println(bufferedReader.readLine());
        }


        socket.close();

    }
}