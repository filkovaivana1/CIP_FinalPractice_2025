import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path directoryPath  = Paths.get("Java_2/Lesson1/src");
        String extension = ".java";

        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath, "*" + extension);
            for (Path entry : directoryStream) {
                System.out.println(entry);
            }
        }catch (IOException e) {
            System.out.println("Error");
        }

//        Path directoryPath = Paths.get("Java_2/Lesson1/src");
//        String extension = ".java";
//
//        try {
//            Files.newDirectoryStream(directoryPath, "*" + extension).forEach(file -> System.out.println(file));
//        } catch (IOException e) {
//            System.err.println("Error");
//        }

//        Path startPath = Paths.get("Java_2/Lesson1/src");
//        String fileExtension = ".java";
//
//        try {
//            DirectoryStream<Path> stream = Files.newDirectoryStream(startPath, "*" + fileExtension);
//            for (Path entry : stream) {
//                System.out.println(entry);
//            }
//        } catch (IOException e) {
//            System.err.println("Error");
//        }
//    }
//

        //        final Path startPath = Paths.get("Java_2/Lesson1/src");
//        final Path startPath = Paths.get("Java_2/Lesson1/TestFiles");
//        final String fileExtension = ".java";
//
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(startPath, "*" + fileExtension)) {
//            for (Path entry : stream) {
//                System.out.println(entry);
//            }
//        } catch (IOException e) {
//            System.err.println("Error occurred while searching for files.");
//            e.printStackTrace();
//        }
//    }

    }
}