import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {

        try {

            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            System.out.println("IP addresses for www.google.com: ");
            for (InetAddress address : addresses) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not find IP address for the specified host");
        }

    }
}