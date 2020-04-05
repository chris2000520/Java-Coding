package package5;
import java.util.*;
public class LQ1001 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] f=new int[n+2];
        f[1]=1;
        f[2]=1;
        for (int i=3;i<=n;i++){
            f[i]=(f[i-1]+f[i-2])%10007;
        }
        System.out.print(f[n]);
    }
}
