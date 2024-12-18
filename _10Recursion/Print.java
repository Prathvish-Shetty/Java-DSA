package _10Recursion;

import java.util.Scanner;

public class Print {
//    static int sn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//          sn = sc.nextInt();
        nto1(n);
        System.out.println();
        int i = 1;
        ex1ton(n,i);
        System.out.println();
        oneton(n);
        System.out.println();
        oton(n,1);
        System.out.println();
//        using global variable
//        oton(1);
    }

    private static void oton(int n, int i) {
        if (i==n)   return;
        System.out.print(i);
        oton(n,i+1);
    }

//    private static void oton(int i) {
//        if (i>sn)   return;
//        System.out.print(i+" ");
//        oton(i+1);
//    }

    private static void oneton(int n) {
        if (n==0)   return;
        oneton(n-1);
        System.out.print(n+" ");
    }

    private static void ex1ton(int n, int i) {
        if (n==0)   return;
        System.out.print(i+" ");
        ex1ton(n-1,i+1);
    }

    private static void nto1(int n) {
        if (n==0)   return;
        System.out.print(n+" ");
        nto1(n-1);
//        System.out.print(n+" ");
    }
}
