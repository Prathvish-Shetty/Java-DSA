package _4Patterns;

import java.util.Scanner;

public class goodPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
/*
//    number and alphabet triangle
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i&1) == 1) System.out.print(j + " ");
                else System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
        System.out.println();

//      Odd Number Triangle
        for (int i = 1; i <= r ; i++) {
            int cnt = 1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(cnt+" ");
                cnt+=2;
            }
            System.out.println();
        }
        System.out.println();
//        jth odd number is 2j-1
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
        System.out.println();
//        Using Arithmetic Progression tn = a + (n-1)d    a = 1. d = 2
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= 2*i-1 ; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//      Floyd's Triangle
//        Using another variable
        int cnt = 1;
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(cnt+++" ");
            }
            System.out.println();
        }
        System.out.println();

//      decreasing column count
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((i-j+1)+" ");
            }
            System.out.println();
        }
        System.out.println();

//      Star Plus only for odd n
//      Hint : print star only for middle row and column otherwise print space
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <= r ; j++) {
                if ((j == r/2+1) ||(i == r/2+1))  System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

//     Star Cross only for odd n
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <= r ; j++) {
                if ((i == j) ||(i + j - 1 == r))  System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

//      Binary Triangle
//        My solution : when addition of i & j is even print 1 else 0
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i ; j++) {
                if ((i+j)%2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % 2 == 1){
                    if (j % 2 == 1) System.out.print("1 ");
                    else System.out.print("0 ");
                } else { // i % 2 == 0
                    if (j % 2 == 0) System.out.print("1 ");
                    else System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i ; j++) {
                if (((i % 2 == 1) && (j % 2 == 1) ||((i % 2 == 0) && (j % 2 == 0)))) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

 */
//      Star triangle horizontally flipped
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r ; j++) {
                if (i + j > r)  System.out.print("* ");
//                else System.out.print(" ");
                else System.out.print("  ");
            }
            System.out.println();
        }









    }

}
