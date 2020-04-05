package package4;
import java.util.*;

public class GA455 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 1};
        System.out.println(findContentChildren(a, b));
    }


    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i <= g.length-1 && j <= s.length-1) {
            if (g[i] > s[j])
                j++;
            i++;
        }
        return j;

    }
}