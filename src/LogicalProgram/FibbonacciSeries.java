package LogicalProgram;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[]args){
        int a=0,b=1,c,count;
        System.out.println("Enter number fibonacci series is print");
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();
        for(int i=0;i<=count;i++){
            System.out.println(""+a);
             c=a+b;
              a=b;
              b=c;

        }


    }
}
