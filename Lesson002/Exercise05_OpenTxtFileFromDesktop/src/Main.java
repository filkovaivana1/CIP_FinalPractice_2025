import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop operations are not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
//        File file = new File("download2_uacs.html");
        try {
//            desktop.open(file);'
            URI uri = new URI("mailto:f.filkova.ivana@gmail.com?subject=TEstSubject&body=Body%20Example");
            desktop.mail(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}