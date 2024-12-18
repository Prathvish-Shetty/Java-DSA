package _20SlidingWindow;

public class MaximumSumSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        int n = arr.length;
        int maxSum = 0;
        /*
        for(int i=0;i<n-k+1;i++){
            int sum = 0;
            for(int j=i;j<=i+k-1;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        */
        int i=0, j=k-1, sum=0;
        for(int a=0;a<=k-1;a++){ // k times
            sum += arr[a];
        }
        i++;j++;
        while(j<n){ // n-k times
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
}
/*
    k sized / variable sized sub array or sub string

    maximum sum sub array of size k
    arr = {10,20,1,3,-40,80,10} , k=3
    m-1 : Brut force
    check for all k sized sub arrays = n-k+1
    TC = O(n*k) it moves towards n^2 if k is almost like n

    "Two consecutive windows of size k have k-1 elements in common"

    optimised approach TC = O(n)
*/
