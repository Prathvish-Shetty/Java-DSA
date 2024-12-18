package _10Recursion;

import java.util.Scanner;

public class maze {
    public static int maze(int sr,int sc,int er,int ec) {   // starting row,column & ending row,column
//        if (sr == er || sc == ec) return 1;
        if (sr == er && sc == ec)   return 1;
        if (sr>er || sc>ec)     return 0;
        int rightWays = maze(sr,sc+1,er,ec);
        int downWays = maze(sr+1,sc,er,ec);
        return rightWays + downWays;
    }
    public static int mazePath(int sr,int sc) {   // starting row,column
        if (sr == 1 || sc == 1)     return 1;
        int rightWays = mazePath(sr,sc-1);
        int downWays = mazePath(sr-1,sc);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
//        Rat in a maze
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        find the number of ways/paths from 1,1 to m,n,if the rat can go right or down
//        System.out.println(maze(1,1,m,n));
        System.out.println(mazePath(m,n));
    }
}
// m*n = m*(n-1) + (m-1)*n