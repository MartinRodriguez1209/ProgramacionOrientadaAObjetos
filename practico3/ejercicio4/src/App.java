import java.util.Random;

public class App {
    public static void atacar() {
        Random rnd = new Random();

        System.out.println(rnd.nextInt((0 + 2 * 10), (10 + 2 * 10)));

    }

    public static void main(String[] args) throws Exception {
        atacar();
    }

}
