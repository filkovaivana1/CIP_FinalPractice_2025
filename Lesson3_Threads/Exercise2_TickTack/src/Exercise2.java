public class Exercise2 {
    public static void main(String[] x) {
        Thread c = new Thread(new TickTack("Casio", 600));
        Thread c2 = new Thread(new TickTack("Flea market clock", 750));
        c2.start();
        c.start();
    }
}