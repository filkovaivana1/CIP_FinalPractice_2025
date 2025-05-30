import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      Path direcotryPath = Paths.get("Java_2/Lesson1/Assignment1_F1");

      try {
          Stream<Path> stream = Files.list(direcotryPath);
          if (stream.findFirst().isPresent()) {
              System.out.println("Not empty");
          } else {
              System.out.println("empty");
          }
      } catch (IOException e) {
          System.err.println();
      }


//        Path directoryPath = Paths.get("Java_2/Lesson1/Assignment1");
//
//        try {
//            Stream<Path> stream = Files.list(directoryPath);
//            if(stream.findFirst().isPresent()){
//                System.out.println("Not empty");
//            } else {
//                System.out.println("Empty");
//            }
//        } catch (IOException e) {
//            System.err.println("Error");
//        }

//        Path directoryPath = Paths.get("Java_2/Lesson1/Assignment1_F1");
//
//        try {
//            Stream<Path> stream = Files.list(directoryPath);
//            if(stream.findFirst().isPresent()) {
//                System.out.println("Not empty");
//            } else {
//                System.out.println("Empty");
//            }
//        } catch (IOException e) {
//            System.err.println("error");
//        }



        //        Path directoryPath = Paths.get("Java_2/Lesson1/Assignment1_F1");
//
//        try (Stream<Path> entries = Files.list(directoryPath)) {
//            if (entries.findFirst().isPresent()) {
//                System.out.println("Directory is not empty.");
//            } else {
//                System.out.println("Directory is empty.");
//            }
//        } catch (IOException e) {
//            System.err.println("Error occurred while checking the directory.");
//            e.printStackTrace();
//        }
    }

}
