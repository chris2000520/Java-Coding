package package3;

import java.util.Scanner;
import java.util.Stack;

public class DFS {
    public static int[][] map=new int[100][100];
    public static boolean[] vis= new boolean[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=in.nextInt();
        int bian=in.nextInt();
        int m,n;
        for (int i=0;i<bian;i++){
            m=in.nextInt();
            n=in.nextInt();
            map[m][n]=1;
            map[n][m]=1;
        }
        System.out.print("深度优先搜索顺序为：");
        dfs(1,max);
    }

    public static void dfs(int i,int max){
        Stack<Integer> stack= new Stack<>();
        stack.push(i);
        System.out.print(stack.peek()+" ");
        vis[1]=true;
        int t=i;
        for (int j=i;;j++){
            if (map[i][j]==1&& !vis[j]){
                stack.push(j);
                vis[j]=true;
                System.out.print(stack.peek()+" ");
                i=j;j=1;
            }
            if (j==max){
                if (stack.peek()==t)
                    break;
                stack.pop();
                i=stack.peek();j=1;
            }
        }
    }
}
