import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client07 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8080);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());
        int n = Integer.parseInt(input.readLine());
        printWriter.println(n);

        for (int i = 0; i < n ; i++){
            System.out.println(bufferedReader.readLine());
            int num = Integer.parseInt(input.readLine());
            printWriter.println(num);
        }
        int[] sortedArr = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.println(bufferedReader.readLine());
        }

        socket.close();

    }
}
