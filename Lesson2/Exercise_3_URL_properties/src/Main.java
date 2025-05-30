import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

    URI uri = URI.create("https://uacs.edu.mk/home/home/");
    try {
        URL url = uri.toURL();
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getPort());
        System.out.println(url.getQuery());
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        System.out.println(url);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("uasc.html"));

        String readline;
        while ((readline = bufferedReader.readLine()) != null) {
            bufferedWriter.write(readline);
            bufferedWriter.newLine();
        }
        System.out.println("Successfully finished downloading from url to file");
        bufferedReader.close();
        bufferedWriter.close();
    } catch (MalformedURLException e) {
        System.out.println("Invalid URL");
    } catch (IOException e) {
        System.out.println("Error while reading content");
       e.printStackTrace();
    }


    }
}