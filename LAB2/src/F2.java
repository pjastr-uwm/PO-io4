import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class F2 {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(23411);
        int[] tab = new int[20];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = random.nextInt(100)+1;
        }
        double temp = 0;
        for(int elem: tab)
        {
            temp+= elem;
        }
        temp /= tab.length;
        System.out.println(Arrays.toString(tab));
        System.out.println("Srednia: "+ temp);
    }
}
