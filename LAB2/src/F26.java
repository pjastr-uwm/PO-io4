import java.util.Arrays;

public class F26 {

    public static void main(String[] args) {
        int[] tab = new int[7];
        System.out.println(Arrays.toString(tab));
        fillArray(tab, 6);
        System.out.println(Arrays.toString(tab));
    }

    public static void fillArray(int[] tab, int val)
    {
        Arrays.fill(tab, val);
    }
}
