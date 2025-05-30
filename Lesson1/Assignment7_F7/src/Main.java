import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        Path directoryPath = Paths.get("Java_2/Lesson1");

        try {
            Files.walkFileTree(directoryPath, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    LocalDate localDate = attrs.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate now = LocalDate.now();

                    if (localDate.isAfter(now.minusDays(7))) {
                        System.out.println(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {

        }


//        Path startDirectory = Paths.get("Java_2/Lesson1");
//        int days = 7;
//
//        try {
//            Files.walkFileTree(startDirectory, new SimpleFileVisitor<>() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//                    LocalDate localDate = attrs.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    LocalDate now = LocalDate.now();
//                    if (localDate.isAfter(now.minusDays(7))) {
//                        System.out.println(file);
//                    }
//                    return FileVisitResult.CONTINUE;
//                }
//            });
//        } catch (IOException e) {
//            System.err.println("Error");
//        }


//        Path startPath = Paths.get("Java_2/Lesson1");
//        int days = 7;
//
//        try {
//            Files.walkFileTree(startPath, new SimpleFileVisitor<>() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//                    LocalDate localDate = attrs.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    LocalDate now = LocalDate.now();
//                    if (localDate.isAfter(now.minusDays(7))) {
//                        System.out.println(file);
//                    }
//                    return FileVisitResult.CONTINUE;
//                }
//            });
//        } catch (IOException e) {
//            System.err.println("Error");
//        }

        //        final Path startPath = Paths.get("Java_2/Lesson1");
//        final int days = 7; // Example: last 7 days
//
//        try {
//            Files.walkFileTree(startPath, new SimpleFileVisitor<>() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//                    LocalDate lastModifiedTime = attrs.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    LocalDate now = LocalDate.now();
//                    if (lastModifiedTime.isAfter(now.minusDays(days))) {
//                        System.out.println(file);
//                    }
//                    return FileVisitResult.TERMINATE;
//                }
//            });
//        } catch (IOException e) {
//            System.err.println("Error occurred while listing files.");
//            e.printStackTrace();
//        }
    }

}
