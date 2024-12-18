package _6TwoDArray;

import java.util.Scanner;

public class matrixMuktiplication {
    public static void print(int[][] arr){
        int m = arr.length,n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void input(int[][] a,int r,int c) {
        System.out.println("Enter matrix elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
//        int[][] a = {{1,2,3},{4,5,6}};
//        int[][] b = {{1,2},{3,4},{5,6}};
//
//        int i1 = a.length;
//        int j1 = a[0].length;
//        int i2 = b.length;
//        int j2 = b[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix 1 rows and colums : ");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        System.out.println("Enter Matrix 2 rows and colums : ");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();

        if (j1 != i2) System.out.println("Matrix cannot be Multiplied");
        else {
            int[][] a = new int[i1][j1];
            input(a,i1,j1);
            int[][] b = new int[i2][j2];
            input(b,i2,j2);

            int[][] c = new int[i1][j2];
            for (int i = 0; i < i1; i++) {
                for (int j = 0; j < j2; j++) {
                    for (int k = 0; k < j1; k++) {
                        c[i][j] += a[i][k]*b[k][j];
//                        a[0][0]*b[0][0] + a[0][1]*b[1][0]
                    }
                }
            }
            print(a);
            print(b);
            print(c);
        }
    }
}
