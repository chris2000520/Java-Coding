package package4;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int[] apple=new int[10];
        for (int i=0;i<10;i++){
            apple[i]=in.nextInt();
        }
        int hight=in.nextInt();
        for (int i=0;i<10;i++){
            if (hight+30>=apple[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
