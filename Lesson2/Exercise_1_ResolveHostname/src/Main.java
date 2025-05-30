import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a hostname: ");
        String hostname = scanner.nextLine();

        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Canonical hostname: " + address.getCanonicalHostName());
            System.out.println("Is it reachable: " + address.isReachable(5000));
        } catch (UnknownHostException e) {
            System.out.println("cannot find address for given host");
        } catch (IOException e) {
             throw new RuntimeException(e);
        }

    }
}