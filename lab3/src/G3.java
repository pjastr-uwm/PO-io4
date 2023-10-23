import java.util.ArrayList;

public class G3 {

    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(-4);
        lt.add(11);
        lt.add(-12);
        System.out.println(lt);
        System.out.println(minimumValue(lt));
        //ArrayList<Integer> lt2 = new ArrayList<>();
        //System.out.println(lt2);
        //System.out.println(minimumValue(lt2));
        //ArrayList<Integer> lt3 = null;
        //System.out.println(lt3);
        //System.out.println(minimumValue(lt3));


    }

    public static int minimumValue(ArrayList<Integer> arg)
    {
//        if(arg == null || arg.isEmpty())
//        {
//            throw new IllegalArgumentException("Lista tablicowa jest pusta lub nullem");
//        }
        int temp = arg.get(0);
        for(int elem: arg)
        {
            if (elem < temp)
            {
                temp =elem;
            }
        }
        return temp;
    }
}
