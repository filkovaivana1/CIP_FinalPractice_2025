import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        if(!Desktop.isDesktopSupported()) {
            System.out.println("Desktop operations are not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        try {
            URI mailToURI = new URI("mailto:f.filkova.ivana@gmail.com?subject=Test%20Subject&body=Message%20Body");
            desktop.mail(mailToURI);
        } catch (URISyntaxException e) {
            System.out.println("Invalid URI.");
        } catch (IOException e) {
            System.out.println("Error happened while sending mail");
            e.printStackTrace();
        }


    }
}