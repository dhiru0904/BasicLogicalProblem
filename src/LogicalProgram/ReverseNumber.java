package LogicalProgram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        reverseNum(n);
    }public static void reverseNum(int n) {
        int reverse = 0, reminder = 0;
        while (n > 0)
        {
            reminder = n % 10;
            reverse = (reverse * 10)+reminder;
            n = n / 10;
        }
        System.out.println("Reverse any number : "+reverse);
    }
}
