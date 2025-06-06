import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path directoryPath = Paths.get("Java_2/Lesson01/Task_1/src");
        try {
            Files.newDirectoryStream(directoryPath, "*" + ".java").forEach(file -> System.out.println(file));


        } catch (IOException e) {
            System.err.println("Error");
            e.printStackTrace();
        }

        }
}