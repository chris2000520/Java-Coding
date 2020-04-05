package package5;
import java.util.*;

public class PAT1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int sum = a + b;
        String s=String.valueOf(sum);
        int l=s.length();
        System.out.print(l);
        for (int i=0;i<l;i++){
            char c=s.charAt(i);
            if (c=='-'){
                System.out.print('-');
                continue;
            }
            System.out.print(c);
            if((i+1)%3==l%3&&(i+1)!=l){
                System.out.print(",");
            }
        }
    }
}
