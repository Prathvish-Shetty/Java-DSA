package _10Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }

    private static int Fact(int n) {
        if (n == 0 || n == 1)   return 1;   // base case
        return n*Fact(n-1); // call
    }
}
