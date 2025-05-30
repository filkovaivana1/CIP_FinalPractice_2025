import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
//        https://uacs.edu.mk/home/home/
//        http://localhost:8080
        try {
            URI uri = URI.create("https://uacs.edu.mk/home/home/");
            URL url = uri.toURL();
            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getQuery());
            System.out.println(url.getProtocol());
            System.out.println(url);


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("uacs1.html"));



        } catch (MalformedURLException e) {}
        catch (IOException e) {}


//        try {
//            URI uri = URI.create("https://uacs.edu.mk/home/home/");
//            URL url = uri.toURL();
//            System.out.println(url.getAuthority());
//            System.out.println(url.getDefaultPort());
//            System.out.println(url.getProtocol());
//            System.out.println(url.getPort());
//            System.out.println(url.getFile());
//            System.out.println(url.getQuery());
//            System.out.println(url.getPath());
//            System.out.println(url);
//
//        } catch (MalformedURLException e) {
//            System.out.println(e.getMessage());
//        }
    }
}