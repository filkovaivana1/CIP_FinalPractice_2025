import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        URI uri = URI.create("https://uacs.edu.mk/home/home/");

        try {
            URL url = uri.toURL();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("download_uacs.html"));
//
//            String readLine;
//            while ((readLine = bufferedReader.readLine()) != null) {
//                bufferedWriter.write(readLine);
//                bufferedWriter.newLine();
//            }
//
//            System.out.println("The file is downloaded from url");
//            bufferedWriter.close();
//            bufferedReader.close();

            InputStream inputStream = new BufferedInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("download2_uacs.html");
            byte[] bufferData = new byte[1024];
            int readBytes;

            while ((readBytes = inputStream.read(bufferData, 0, 1024)) != -1) {
                fileOutputStream.write(bufferData, 0, readBytes);
            }

            System.out.println("The content from url was successfully saved to file");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}