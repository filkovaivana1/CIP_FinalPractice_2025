import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {

        Path filePath = Paths.get("Java_2/Lesson001/1234.txt");
        String textToAppend = "JAva is fun";
//        byte[] dataTOwrite = {12,3,4,5};

        try {
            Files.write(filePath, textToAppend.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            byte[] dataRead = Files.readAllBytes(filePath);
//            for (byte b: dataRead) {
//                System.out.print(b + " ");
//            }

        }  catch (IOException e) {
            System.err.println("Error");
        }

    }
}