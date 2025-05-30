import java.net.*;
import java.io.*;
public class Server5{
    public static void main(String[] a) throws Exception {
        ServerSocket s=new ServerSocket(8080);
        Socket p = s.accept();
        PrintWriter x = new PrintWriter( new OutputStreamWriter( p.getOutputStream() ), true );
        BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
        // accepting the number of elements
        int number= Integer.parseInt(is.readLine());
        int array[]=new int[number];

        // accepting the elements

        for(int i=0;i<number;i++){
            array[i]=Integer.parseInt(is.readLine());
        }

        // processing the array
        int min=array[0];
        for(int i=1;i<number;i++){
            if( array[i]<min)
                min=array[i];
        }
        // sending the result
        x.println(min);

        p.close();
        is.close();


    }

}