package LogicalProgram;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n;
        System.out.println("checked any number ");
        Scanner d = new Scanner(System.in);
        n = d.nextInt();
    }
        public static void prime(int n){
            boolean b = false;
            for (int i = 2; i <=n / 2; i++) {
                if (n % i == 0) {
                    b = true;
                    break;
                }
            }
            if (!b)
                System.out.println(n+"prime number" );
            else
                System.out.println(n+"Not prime number");

        }

    }

