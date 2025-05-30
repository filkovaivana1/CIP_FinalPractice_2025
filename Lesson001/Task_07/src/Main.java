import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("Java_2/Lesson1");

        try {
            Files.walkFileTree(path, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
                    LocalDate localDate = attributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    System.out.println(localDate);
                    LocalDate now = LocalDate.now();
                    if (localDate.isAfter(now.minusDays(1))) {
                        System.out.println(file);
                    }
                    return FileVisitResult.TERMINATE;
                }
            });
        } catch (IOException e) {
            System.err.println("Error");
        }

    }
}