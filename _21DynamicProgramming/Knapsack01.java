package _21DynamicProgramming;

public class Knapsack01 {
    /*  recursive
    private static int profit(int i, int[] wt, int[] val, int C, int[][] dp){  // weight, price, capacity
        if(i<0)  return 0;
        if(dp[i][C] != -1)  return dp[i][C];
        int skip = profit(i-1,wt,val,C,dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i-1,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16}; // 5,3,7,16
        int[] wt = {1,2,8,10};
        int C = 8;
        int n = wt.length;
//        i : n-1 -> 0 | C : C -> 0
        int[][] dp = new int[n][C+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)    dp[i][j] = -1;
        System.out.println(profit(n-1,wt,val,C,dp));
    }

     */
//    iterative
    public static void main(String[] args) {
        int[] val = {5,3,9,16}; // 5,3,7,16
        int[] wt = {1,2,8,10};
        int C = 8;
        int n = wt.length;
//        i : n-1 -> 0 | C : C -> 0
        int[][] dp = new int[n][C+1];
        for(int i=0;i<dp.length;i++){
            for(int c=0;c<dp[0].length;c++){
                int skip = (i>0) ? dp[i-1][c] : 0;
                if(wt[i]>c)  dp[i][c] = skip;
                else{
                    int pick = val[i];
                    pick += (i>0) ? dp[i-1][c-wt[i]] : 0;
                    dp[i][c] = Math.max(pick,skip);
                }
            }
        }
        System.out.println(dp[n-1][C]);
    }
}
/*
    0/1 knapsack either take or not
    when we don't have algorithm, try out all possible combinations
    for array of length n TC = 2^n

    we have 3 options
    wt[i]>C : skip
    wt[i]<=C : skip or take
    TC = 2^n
    SC = n*C
    i : 0 -> n-1
    C : C -> 0
    number of changing parameters determine the dimension of a dp array
    we can replace C & i

    after recursion + memoization
    TC = SC = O(n*C)

*/
// we can use hashmaps for negative indexing

/*
private static int profit(int i, int[] wt, int[] val, int C, int[][] dp){  // weight, price, capacity
    if(i == wt.length)  return 0;
    if(dp[i][C] != -1)  return dp[i][C];
    int skip = profit(i+1,wt,val,C,dp);
    if(wt[i]>C) return dp[i][C] = skip;
    int pick = val[i] + profit(i+1,wt,val,C-wt[i],dp);
    return dp[i][C] = Math.max(pick,skip);
}
public static void main(String[] args) {
    int[] val = {5,3,9,16}; // 5,3,7,16
    int[] wt = {1,2,8,10};
    int C = 8;
    int n = wt.length;
    int[][] dp = new int[n][C+1];
    for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[0].length;j++)    dp[i][j] = -1;
    System.out.println(profit(0,wt,val,C,dp));
}
*/

/*
    Tabulation formula
    if(wt[i]>C) profit(i,C) = profit(i-1,C)
    else    profit(i,c) = max(val[i]+profit(i-1,c-wt[i]),profit(i-C))

    dp[i][C] = max(val[i]+dp[i-1][c-wt[i]],dp[i-1][c])
 */