public class H20 {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Olsztyn");
        trimToSize(s1, -2);
        System.out.println(s1);
    }

    public static void trimToSize(StringBuffer sb, int n)
    {
        if (n< 0)
            return;
        if (sb.length() > n) {
            sb.setLength(n);
        }
    }
}
