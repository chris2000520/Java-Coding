package package5;

import java.util.Scanner;

public class LQ1003 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long sum=n*(n+1)/2;
        System.out.printf("%d",sum);
    }
}
