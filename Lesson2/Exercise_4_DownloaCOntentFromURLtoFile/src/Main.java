import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void downloadFileFromUr(String urlString, String outputFilePath) {

        try {
            InputStream inputStream = new BufferedInputStream(new URL(urlString).openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
            byte[] bufferData = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(bufferData, 0, 1024)) != -1) {
                fileOutputStream.write(bufferData, 0, bytesRead);
            }

            System.out.println("finished downloading content from url to html");

        } catch (MalformedURLException e) {
            System.out.println("Invalid url");
        } catch (FileNotFoundException e) {
            System.out.println("Specified file not found");
        } catch (IOException e) {
            System.out.println("Error opening the stream");
        }


        }


    public static void main(String[] args) {

        String url = "https://github.com/";
        String outFilePath = "download_github.html";
        downloadFileFromUr(url, outFilePath);
    }
}