package _21DynamicProgramming;

public class SubsetSum {
    private static boolean ssum(int i, int[] arr, int target, int[][] dp){
        if(i<0)   return target==0;
        if(dp[i][target] != -1) return dp[i][target]==1;    //  1=true,0=false
        boolean ans = false;
        boolean skip = ssum(i-1,arr,target,dp);
        if(target-arr[i]<0)   ans=skip;    // only valid for +ve numbers
        else{
            boolean pick = ssum(i-1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        int n = arr.length;
        int[][] dp = new int[n][target+1];
//        i : n-1 -> 0 | target : target -> 0   
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
        System.out.println(ssum(n-1,arr,target,dp));
    }
}
/*  Recursion : TC = O(2^n), SC = O(n*target)
    private static boolean ssum(int i, int[] arr, int target){
        if(i==arr.length)   return target==0;
        boolean skip = ssum(i+1,arr,target);
        if(target-arr[i]<0)   return skip;    // only valid for +ve numbers
        boolean pick = ssum(i+1,arr,target-arr[i]);
        return pick || skip;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        System.out.println(ssum(0,arr,target));
    }
*/
/*
    private static boolean ssum(int i, int sum, int[] arr, int target){
        if(i==arr.length)   return sum == target;
        boolean skip = ssum(i+1,sum,arr,target);
        if(sum+arr[i]>target)   return skip;    // only valid for +ve numbers
        boolean pick = ssum(i+1,sum+arr[i],arr,target);
        return pick || skip;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        System.out.println(ssum(0,0,arr,target));
    }
*/

// n : 0->n-1 , target : target->0

/*
public class SubsetSum {
    private static int ssum(int i, int[] arr, int target, int[][] dp) {
        if (target == 0) return 1; // target reached, return true
        if (i == arr.length) return 0; // no more elements to consider, return false
        if (dp[i][target] != -1) return dp[i][target]; // already computed

        int skip = ssum(i + 1, arr, target, dp);
        int pick = 0;
        if (target - arr[i] >= 0) { // only valid for +ve numbers
            pick = ssum(i + 1, arr, target - arr[i], dp);
        }

        dp[i][target] = (skip == 1 || pick == 1) ? 1 : 0; // store result in dp array
        return dp[i][target];
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 4};
        int target = 9;
        int n = arr.length;
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(ssum(0, arr, target, dp) == 1 ? "true" : "false");
    }
}

 */

/* DP using boolean  n : 0->n-1 , target : target->0
        private static boolean ssum(int i, int[] arr, int target, int[][] dp){
        if(i==arr.length)   return target==0;
        if(dp[i][target] != -1) return dp[i][target]==1;    //  1=true,0=false
        boolean ans = false;
        boolean skip = ssum(i+1,arr,target,dp);
        if(target-arr[i]<0)   ans=skip;    // only valid for +ve numbers
        else{
            boolean pick = ssum(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        int n = arr.length;
        int[][] dp = new int[n][target+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
        System.out.println(ssum(0,arr,target,dp));
    }
*/