package _10Recursion;

import java.util.Scanner;

public class generateBinaryString {
    private static void gbs(int n,String s){    // my code
        if (n == 0) {
            System.out.println(s);
            return;
        }
        gbs(n-1,s+0);
        if (!s.endsWith("1"))     gbs(n-1,s+1);
    }
    private static void gbs1(int n,String s){
        int m = s.length();
        if (m == n){
            System.out.println(s);
            return;
        }
        if (n == 0 || s.charAt(m-1) == '0'){
            gbs1(n,s+0);
            gbs1(n,s+1);
        }
        else gbs1(n,s+0);
    }

    public static void main(String[] args) {
//        Generate all primary strings of length n without consecutive 1's
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        gbs(3,"");
    }
}
