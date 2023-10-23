import java.util.Scanner;

public class H8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj napis");
        String napis = input.nextLine();
        System.out.println("Podaj prefix");
        String prefix = input.nextLine();
        System.out.println("Podaj sufix");
        String sufix = input.nextLine();
        if (napis.startsWith(prefix))
        {
            System.out.println("Prefiks jest na początku napisu");
        }
        else
        {
            System.out.println("Prefiks nie jest na początku napisu");
        }
        if (napis.endsWith(sufix))
        {
            System.out.println("Sufix jest na początku napisu");
        }
        else
        {
            System.out.println("Sufix nie jest na początku napisu");
        }
    }
}
