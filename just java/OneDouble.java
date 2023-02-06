import java.util.Scanner;

public class OneDouble
{
    public static void main (String[] args)
    {
        int num;
        double dec;
        num = 6;
        dec = 1.8;
        System.out.println("A. \none(7, 9) = " + one(7, 9));
        System.out.println("two(num, dec) = " + two(num, dec));
    }

    public static int one (int x, int y)
    {
        if (x > y) {
            return x + y;
        } else {
            return x - 2 * y;
        }
    }

    public static double two (int x, double a)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nB.\nnum = 6, dec = 1.8\nEnter a number: ");
        double z = in.nextDouble();

        z = z + a;
        int first = one(6, 8);
        first = first + x;
        if (z > 2 * first) {
            return z;
        } else {
            return 2 * first - z;
        }
    }
}