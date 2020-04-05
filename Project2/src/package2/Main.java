package package2;

import java.util.Scanner;

public class Main {
    public static int[][] f=new int[1000][1000];
    public static int m,n;
    public static int[][] value=new int[1000][1000];
    public static int[][] result=new int[1000][1000];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                value[i][j]=in.nextInt();
            }
        }
        //i表示第几家公司，j表示分配的机器数，f[i][j]表示当前下收益最大值
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                for(int k=0;k<=j;k++) {
                    int val=f[i-1][j-k]+value[i][k];
                    if (f[i][j]<val) {
                        f[i][j]=val;
                        result[i][j] = k;
                    }
                }
            }
        }
        System.out.println(f[m][n]);
        output(m,n);
    }
    public static void output(int m,int n){
        if(m==0){
            return;
        }
        output(m-1,n-result[m][n]);
        System.out.println(m+" "+result[m][n]);
    }
}
