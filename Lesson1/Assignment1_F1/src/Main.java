import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        long timeStamp = System.currentTimeMillis();
//        String filePathString = "Java_2/Lesson1/uniqueFile_" + timeStamp + ".txt";
        String filePathString = "Java_2/Lesson1/uniqueFile_1739432899469.txt";

        File f = new File(filePathString);
        if(f.exists()) {
            System.out.println("File already exist");
        } else {
            Path filePath = Paths.get(filePathString);
            Files.createFile(filePath);
            System.out.println("Successfully created file");
            File f1 = new File(filePathString);
            System.out.println("FIle info: " + f1.getName() + ", relative path(String): " + f1.getPath() + ", absolute path(String): " + f1.getAbsolutePath() + ", readRights: " + f1.canRead());
        }







        // File f= new File("C:\\test\\text.txt");
//        File f= new File("text.txt");
//        if (! f.exists()){
//            f.createNewFile();
//            System.out.println("You have created a new file");
//        }
//        else{
//            System.out.println("There is already a file with that name on that location" );
//        }

//        long timestamp = System.currentTimeMillis();
//        String filePathString = "Java_2/Lesson1/uniqueFile_" + timestamp + ".txt";
//
//
//        File file = new File(filePathString);
//        if(file.exists()) {
//            System.out.println("Alredy exist");
//        } else {
//            Path filePath = Paths.get(filePathString);
//            Files.createFile(filePath);
//            System.out.println("File name; " + file.getName() + " " + file.getPath());
//        }





//        long timestamp = System.currentTimeMillis();
//        String filePathString = "Java_2/Lesson1/uniqueFile_" + timestamp + ".txt";
//        Path filePath = Paths.get(filePathString);
//
//        File foundFile = new File("Java_2/Lesson1/uniqueFile_1739446991893.txt");
//        if(foundFile.exists()) {
//            System.out.println("File with that name already exists on that location");
//        } else {
//
//        Files.createFile(filePath);
//        System.out.println("File successfully created: " + filePath);
//
//        File f = new File(filePathString);
//        System.out.println("File name: " + f.getName());
//        System.out.println("Relative path: " + f.getPath());
//        System.out.println("Absolute path (String)" + f.getAbsolutePath());
//        System.out.println("Canonical path (String): " + f.getCanonicalPath());
//        System.out.println("Absolute path of a file: " + f.getAbsoluteFile());
//        System.out.println("Canonical path of a file: " + f.getCanonicalPath());
//        System.out.println("Reading privilege: " + f.canRead());
//        System.out.println("Writing privilege: " + f.canWrite());
//        System.out.println("Executing privilege: " + f.canExecute());
//}

//        long timestamp = System.currentTimeMillis();
//        String pathString = "Java_2/Lesson1/uniqueFile_" + timestamp + ".txt";
//        Path filePath = Paths.get(pathString);
//
//        Files.createFile(filePath);
//        System.out.println("Unique file created successfully: " + filePath);
//
//
//        File f = new File(pathString);
//        //name
//        System.out.println("Name: " + f.getName());
//        //location
//        System.out.println("Path: " + f.getPath());
//
//        //location
//        System.out.println("Absolute path: (String) " + f.getAbsolutePath());
//        //canonical
//        System.out.println("Canonical path: (String)" + f.getCanonicalPath());
//        //location
//        System.out.println("Absolute path of file: " + f.getAbsoluteFile());
//        //canonical
//        System.out.println("Canonical path of file: " + f.getCanonicalFile());
//        //can it be read from
//        System.out.println("Reading privilege: " + f.canRead());
//        //can it be written into
//        System.out.println("Writing privileges: " + f.canWrite());

        //can it be executed
        //System.out.println("Executing privileges: "+f.canExecute());
    }

}
