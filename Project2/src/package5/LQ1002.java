package package5;

import java.util.Scanner;

public class LQ1002 {

    public static void main(String[] args) {

        final double p = 3.14159265358979323;
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        in.close();

        System.out.printf("%.7f", p * r * r);

    }

}
