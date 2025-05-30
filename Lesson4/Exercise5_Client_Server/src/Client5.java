import java.io.*;
import java.net.*;
public class Client5 {
    public static void main(String[] args) throws Exception{
        String server = "localhost";
        int port = 8080;
        Socket client = new Socket(server, port);
        PrintWriter os = new PrintWriter( new OutputStreamWriter( client.getOutputStream() ), true );
        BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
        if (client == null || os == null || is == null) {
            System.err.println( "Something is wrong." );
            return;
        }
        int []a=new int[5];
        a[0]=5;
        a[1]=9;
        a[2]=-6;
        a[3]=7;
        a[4]=9;
        // sending the number of elements
        os.println("5");
        // sending the elements
        for(int i=0;i<5;i++){
            os.println(a[i]);
        }

        // outputting the array
        for(int i=0;i<5;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        // the reply from the server
        int minimum = Integer.parseInt(is.readLine());
        System.out.println("The server has calculated that the minimum element in the array is " + minimum + "\n" );
        os.close();
        is.close();
        client.close();

    }
}