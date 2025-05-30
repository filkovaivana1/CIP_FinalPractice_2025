import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTask extends Thread {
    private String fileName;

    public FileReaderTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + fileName + " not found");
        }
    }


}