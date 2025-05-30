import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path filePath = Paths.get("Java_2/Lesson01/binaryFile.bin");
        byte[] array = {1,2,3,4,5};

        try {
            Files.write(filePath, array);
            System.out.println("THe content was successfully added to a file");

             byte[] readData = Files.readAllBytes(filePath);
             for (byte b : readData) {
                 System.out.print(b + " ");
             }
        } catch (IOException e){

        }
        }
}