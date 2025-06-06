import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        long timeStamp = System.currentTimeMillis();
        String filePathString = "Java_2/Lesson01/UniqueFile1739464108811.txt";
        File file = new File(filePathString);
        if (file.exists()) {
            System.out.println("This file already exists");
        } else{
            Path path = Paths.get("Java_2/Lesson01/UniqueFile1739464108811.txt");
            try {
                Files.createFile(path);
                System.out.println("THe file is successfully generated");
            } catch (IOException e) {
                System.err.println("Error occurred while creating file");
            }

        }



    }
}