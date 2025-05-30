import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop operations are not supported.");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        File file = new File("test.txt");
        try {
            desktop.open(file);
            System.out.println("Successfully opened file");
        } catch (IOException e) {
            System.out.println("error while opening the file");
            e.printStackTrace();
        }

    }
}