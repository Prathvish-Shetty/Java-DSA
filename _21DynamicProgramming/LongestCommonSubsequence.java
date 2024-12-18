package _21DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

    }
}
/*
    s1 and s2 are 2 strings having length m and n
    if(s1[m-1]==s2[n-1])    lcs = 1 + lcs(0 to m-2 of s1 & 0 to n-2 of s2)
    order must be same
*/