import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path filePath = Paths.get("Java_2/Lesson001/uniqueName_1739551417987.txt");
       try {
           List<String> lines = Files.readAllLines(filePath);
           System.out.println("Number of lines: " + lines.size());
       } catch (IOException e) {

       }
       }
}