package _10Recursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        Sumn(n,0);
        System.out.println(sum(n));

    }

    private static void Sumn(int n,int sum) {
        if (n == 0){
            System.out.println(sum);
            return;
        }
        Sumn(n-1,sum+n);    // call & work
    }
    private static int sum(int n) {
        if (n == 0 || n == 1)   return 1;
        return n+sum(n-1);
    }
}
