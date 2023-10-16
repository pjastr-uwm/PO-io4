import java.util.Random;

public class Losowosc {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(3476);
        int a = random.nextInt(51);
        System.out.println(a);
    }
}
