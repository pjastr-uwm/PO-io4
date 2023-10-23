import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(5);
        lt.add(-5);
        lt.add(11);
        lt.add(23);
        lt.add(-56);
        lt.add(12);
        lt.add(-8);
        lt.add(11);
        lt.add(-5);
        lt.add(7);
        System.out.println(lt);
        for(int i=lt.size()-1;i>=0;i--)
        {
            System.out.println(lt.get(i));
        }
    }
}
