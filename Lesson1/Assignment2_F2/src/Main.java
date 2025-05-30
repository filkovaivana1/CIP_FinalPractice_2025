import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("Java_2/Lesson1/uniqueFile_1739432899469.txt");

        try {
            List<String> lines =  Files.readAllLines(filePath);
            System.out.println("Number fo lines: " + lines.size());
        } catch (IOException e) {
            System.err.println("Errror");
        }
//        Path filePath = Paths.get("Java_2/Lesson1/uniqueFile_1739432899469.txt");
//
//        try {
//            List<String> lines = Files.readAllLines(filePath);
//            System.out.println("Num of lines: " + lines.size());
//        } catch (IOException e) {
//            System.err.println("Error occurred while reading the file");
//        }
        //        Path filePath = Paths.get("Java_2/Lesson1/uniqueFile_1739432899469.txt");
//
//        try {
//            List<String> lines = Files.readAllLines(filePath);
//            System.out.println("Number of lines: " + lines.size());
//        } catch (IOException e) {
//            System.err.println("Error occurred while reading the file.");
////            e.printStackTrace();
//        }
    }

}
