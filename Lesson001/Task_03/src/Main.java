import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("Java_2/Lesson001/src");


        String ext = ".java";
        try {

          Stream<Path> stream = Files.list(directoryPath);
          if(stream.findFirst().isPresent()){
              System.out.println("DIrectory is not empty");
          } else {
              System.out.println("Dir is empty");
          }
//            Files.newDirectoryStream(directoryPath, "*" + ext).forEach(p -> System.out.println(p));

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}