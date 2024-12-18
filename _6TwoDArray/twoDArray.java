package _6TwoDArray;
import java.util.Scanner;
//  c,c++ garbage value when initialized whereas in java 0 is default value
//  2-D array is array of arrays
public class twoDArray {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[r][c];
        int m = grid.length; // tells no. of rows/lines
        int n = grid[0].length; // no. of columns
        for (int i = 0; i < r; i++) {//rows
            for (int j = 0; j < c; j++) {//cols
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {//rows
            for (int j = 0; j < c; j++) {//cols
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] arr : grid){
            for(int ele : arr)
                System.out.print(ele+" ");
            System.out.println();
        }

        int[][] g = new int[4][2];
//        Store marks and roll no of students
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }
 */
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > mx) mx = arr[i][j];
                sum += arr[i][j];
            }
        }
        System.out.println("Max = "+mx+" Sum = "+sum);

//        Add 2 Matrices
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Row wise");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
//        column wise printing
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
//        Storing in new array
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = a[j][i];
            }
            System.out.println();
        }
//        Rotate a square matrix by 90 degree
//        Transpose and then reverse each row

//      Step 1 : Transpose without using extra space
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        print(arr);

//      Step 2 : Rotate/Reverse each row
        for (int i = 0; i < m; i++) {
            int l = 0,h = n-1;
//            swap arr[i][a] and arr[i][b]
            while (l<h){
                int temp = arr[i][l];
                arr[i][l] = arr[i][h];
                arr[i][h] = temp;
                l++;h--;
            }
        }
        print(arr);

//      Wave Print
        for (int i = 0; i < n; i++) {
            if (i%2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for (int j = n-1; j >= 0 ; j--) {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
