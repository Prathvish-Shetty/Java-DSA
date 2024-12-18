package _10Recursion;

import java.util.Scanner;

public class GCD {
    public static int hcf(int a,int b) {
//        int gcd = 1;
//        for (int i = 2; i <= Math.min(a,b); i++) {
//            if (a%i == 0 && b%i == 0)   gcd = i;
//        }
//        return gcd;
        for (int i = Math.min(a,b); i >= 1; i--) {  // TC = min(a,b)
            if (a%i == 0 && b%i == 0)   return i;
        }
        return 1;
    }
    public static int gcd(int a,int b) {

//        if (a%b == 0) return b;
//        return gcd(a,a%b); //dont work for a<b

//        it adjusts the order of arguments implicitly to ensure that the larger number is always passed as the first argument.
//        if (b%a == 0) return a;
//        return gcd(b%a,a);

        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
//        GCD or HCF(a,b) >= min(a,b)
//        LCM(a,b) >= max(a,b)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println("GCD("+a+","+b+") = "+hcf(a,b));
        System.out.println("GCD("+a+","+b+") = "+gcd(a,b));
    }
//    Eucledian algorithm
//    static int gcd(int a, int b)
//    {
//        // Everything divides 0
//        if (a == 0)
//            return b;
//        if (b == 0)
//            return a;
//
//        // Base case
//        if (a == b)
//            return a;
//
//        // a is greater
//        if (a > b)
//            return gcd(a - b, b);
//        return gcd(a, b - a);
//    }
}
