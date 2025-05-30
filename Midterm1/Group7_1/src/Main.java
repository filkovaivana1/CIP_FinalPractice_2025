import java.io.*;
import java.util.Scanner;


public abstract class Main extends Reader {
    public Main(File file) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String logFile = "test.txt";






        File file = new File(logFile);
        if (!file.exists()) {
            System.out.println("Error: File not found");
        }
        try (BufferedReader reader = new BufferedReader(new Main(file) {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
        })) {
            System.out.println("Content:");
            String line;
            while (true) {
                try {
                    if (!((line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public void close() throws IOException {

    }
}