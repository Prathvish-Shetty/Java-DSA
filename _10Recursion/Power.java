package _10Recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int a,int b) {    // TC = O(b)
        if (b == 0)     return 1;
        return a*pow(a,b-1);
    }// we are considering 0^0 = 1 | for 0^0 Not defined add condition if(a == 0 && b == 0) sout("Not Defined") return 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exponent & power : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(pow(a,b));
        System.out.println(p(a,b));
    }

    private static int p(int a, int b) {    // a^b = (a^b/2)^2
        if (b == 0) return 1;
        int ans = p(a,b/2);
        if (b%2 == 0)   return ans*ans;
        return ans*ans*a;
    }   // TC = O(logb)
}
// Recursion Tree - parent , left , right
// Euler Tour tree