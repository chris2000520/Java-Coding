package package1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static int a, b, startx, starty, endx, endy;
    public static int[][] map;
    public static int[][] move = {
            {0, 1},
            {0, -1},
            {-1, 0},
            {1, 0}};
    public static void main(String[] arg1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入迷宫大小（行列）：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        map = new int[a + 2][b + 2];
        for (int i = 1; i <= a; i++)
            for (int j = 1; j <= b; j++) {
                map[i][j] = scanner.nextInt();
            }
        System.out.println("请输入起点：");
        startx = scanner.nextInt();
        starty = scanner.nextInt();
        System.out.println("请输入终点：");
        endx = scanner.nextInt();
        endy = scanner.nextInt();
        if (BFS()==-1)
            System.out.print("无法到达终点！");
        else
        System.out.print("最少需要" + BFS() + "步。");
    }

    public static int BFS() {
        Queue<Pos> queue = new LinkedList<>();
        boolean[][] vis = new boolean[a + 2][b + 2];
        Pos frontpos = new Pos(startx, starty, 0);
        queue.offer(frontpos);
        vis[startx][starty] = true;
        while (!queue.isEmpty()) {
            frontpos=queue.poll();
            for (int i = 0; i < 4; i++) {
                int rx = frontpos.x + move[i][0];
                int ry = frontpos.y + move[i][1];
                if (rx > a || rx < 1 || ry < 1 || ry > b || vis[rx][ry])
                    continue;
                if (map[rx][ry]==1)
                    continue;
                vis[rx][ry] = true;
                if (rx == endx && ry== endy) {
                    return frontpos.step+1;
                }
                queue.offer(new Pos(rx,ry,frontpos.step+1));
            }
        }
        return -1;
    }
}