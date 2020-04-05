package package5;

import java.util.Arrays;
import java.util.Scanner;

public class LQ1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (num[j] > num[j + 1]) {
//                    int t = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = t;
//                }
//            }
//        }
        Arrays.sort(num);
        for(int i = 0 ; i < n ;i++){
            System.out.print(num[i]+" ");
        }
    }
}
