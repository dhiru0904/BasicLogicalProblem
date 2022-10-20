import java.util.Random;
import java.util.Scanner;
public class CouponNo {
    public static void main(String[] args) {
        System.out.println(" random number" + " distinct coupon number");
        Scanner d = new Scanner(System.in);
        int size = d.nextInt();
        d.close();
        int randomNo = 0;
        int a[] = new int[size];
        Random coupon = new Random();
        boolean flag;
        for (int i = 0; i<size; i++)
        {
            randomNo = coupon.nextInt(20);
            flag = isPresent(a, randomNo);
            if (flag != true)
            {
                a[i] = randomNo;}
            else
            {
                --i;
            }}
        System.out.println("The random number print ");
        for (int i = 0; i<a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
    public static boolean isPresent(int[] a, int randomNum)
    {
        for (int i =0; i<a.length;i++)
        {
            if (a[i] == randomNum)
            {
                return true;
            }}
        return false;
    }}