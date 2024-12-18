package _4Patterns;

import java.util.Scanner;

public class SimplePatterns {
    public static void main(String[] args){
//        Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
/*
//        Rectangle
        for(int i = 0 ; i < r ; i++){
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


//        Square(i : 1 -> n ; j : 1 -> n)
        for(int i = 0 ; i < r ; i++){
            for (int j = 0; j < r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


//      Number Square
        for(int i = 0 ; i < r ; i++){
            for (int j = 1; j <= r; j++) {
                System.out.print(j+" ");
//                System.out.print(i+" ");

            }
            System.out.println();
        }
        System.out.println();

//      Alphabet square
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
//                System.out.print((char)('A' + j) + " ");
//                System.out.print((char)('A' + i) + " ");
//                System.out.print((char)('a' + i) + " ");
                System.out.print((char)('a' + j) + " ");

            }
            System.out.println();
        }
        System.out.println();

//      Star & Number Triangle
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//                System.out.print(j+" ");
//                System.out.print(i+" ");
                System.out.print((char) ('A' + j -1) + " ");

            }
            System.out.println();
        }
        System.out.println();

//      Reverse Triangle (
//          i + jmax = r + 1
//          jmax = n + 1 - i
//          j <= n + 1 - i
//      )
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <=  r - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = r; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
//                System.out.print(j+" ");
//                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <=  r - i + 1 ; j++) {
//                System.out.print(j+" ");
//                System.out.print(i+" ");
//                System.out.print((char) ('A'+j-1) + " ");
                System.out.print((char) ('A'+i-1) + " ");

            }
            System.out.println();
        }
        System.out.println();
 */















//        Square(i : 1 -> n ; j : 1 -> n)
//        Triangle(i : 1 -> n ; j : 1 -> i)
//        Triangle(i : 1 -> n ; j : 1 -> n-i+1)

    }
}
