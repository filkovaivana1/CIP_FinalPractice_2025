import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        if(!Desktop.isDesktopSupported()) {
            System.out.println("Desktop applications are not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        File file = new File("test.txt");
        try {
//            desktop.open(file);
            URI uri = new URI("mailto:f.filkova.ivana@gmail.com?subject=testSubject&body=bodyCOntent");
            desktop.mail(uri);
        } catch (IOException e) {
            System.out.println("Error happened while opening the file");
        } catch (URISyntaxException e) {
            System.out.println("Error while sending email");
        }
    }
}