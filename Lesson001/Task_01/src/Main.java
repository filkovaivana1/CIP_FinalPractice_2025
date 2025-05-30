import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        long timeStamp = System.currentTimeMillis();
        String filePathString = "Java_2/Lesson001/uniqueName_" + timeStamp + ".txt";
        File f = new File(filePathString);
        if(f.exists()){
            System.out.println("FIle already exist on given location");
        } else {
            Path filePath = Paths.get(filePathString);
            try {
                Files.createFile(filePath);
                System.out.println("THe file was successfully created");
                File f1 = new File(filePathString);
                System.out.println("File name: " + f1.getName());
                System.out.println("File relative path (String): " + f1.getPath());
                System.out.println("FIle absolute path (String): " + f1.getAbsolutePath());
                System.out.println("File read privilege: " + f1.canRead());
                System.out.println("File writing privilege: " + f1.canWrite());
                System.out.println("File execute privilege: " + f1.canExecute());


            } catch (IOException e) {
                System.err.println("Error occurred while creating file");
                e.printStackTrace();
            }
            }


    }
}