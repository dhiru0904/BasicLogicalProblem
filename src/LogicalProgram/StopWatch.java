package LogicalProgram;

import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter '1' to start ");
        int watch = d.nextInt();
        long startMillis = System.currentTimeMillis();
        System.out.println("Stopwatch start");
        System.out.println("Stopwatch Started "+startMillis);
        System.out.println("Enter '0' to stop stopwatch");
        watch = d.nextInt();
        d.close();
        long stopMillis = System.currentTimeMillis();
        System.out.println("Stopwatch Stopped "+stopMillis);
        elapseCount(startMillis, stopMillis);
    }

    public static void elapseCount(long startMillis, long stopMillis) {
        double elapse = stopMillis - startMillis;
        double seconds = elapse / 1000;
        System.out.println("Time elapse in seconds = " + seconds);
    }

}

