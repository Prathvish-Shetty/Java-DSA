package _21DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/*  using recursion + memoization
public class FriendsPairingProblem {
    private static int pair(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1)   return dp[n];
        return dp[n] = (pair(n-1,dp) + (n-1)*pair(n-2,dp));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
}
*/
public class FriendsPairingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=2){
            System.out.println(n);
            return;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
/*
 friends pairing problem
 pairing(n) = n*[pairing(n-1) + (n-1)*pairing(n-1)]     -> (single+pair)
 the above will generate all permutations ie ab not equal to ba
 for combination
 pairing(n) = [pairing(n-1) + (n-1)*pairing(n-1)]
*/