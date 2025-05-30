import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {

        Path filePath = Paths.get("JAva_2/Lesson1/123.txt");
        String textToAppend = "HEllo world";

        try {
            Files.write(filePath, textToAppend.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Text appended to file");
        } catch (IOException e) {
            System.err.println();
        }

//        Path filePath = Paths.get("Java_2/Lesson1/123.txt");
//        String textToAppend = "Java is fun";
//
//        try {
//            Files.write(filePath, textToAppend.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            System.out.println("Text appended successfully to the file");
//        } catch (IOException e) {
//            System.err.println("Error");
//        }
//        Path filePath = Paths.get("Java_2/Lesson1/uniqueFile_1739432899469.txt");
//        String textToAppend = "Java is fun";
//
//        try {
//            Files.write(filePath, textToAppend.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            System.out.println("Text appended to file successfully");
//        } catch (IOException e) {
//            System.err.println("Error");
//        }
        //        Path filePath = Paths.get("Java_2/Lesson1/uniqueFile_1739432899469.txt");
//        String textToAppend = "Java is fun!\n";
//
//        try {
//            Files.write(filePath, textToAppend.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            System.out.println("Text appended to file successfully.");
//        } catch (IOException e) {
//            System.err.println("Error occurred while appending to the file.");
//            e.printStackTrace();
//        }
    }

}
