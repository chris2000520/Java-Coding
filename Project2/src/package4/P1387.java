package package4;

import java.util.Scanner;

public class P1387 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] dis=new int[100][100];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                dis[i][j]=in.nextInt();
            }
        }

    }
}
