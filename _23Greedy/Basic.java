package _23Greedy;

public class Basic {
    public static void main(String[] args) {
        int[] a = { -1, -1, -2, 4, 3 };
        solve(a);
    }

    private static int solve(int[] a) {
        int n = a.length;
        if(n==1)    return a[0];
        int negMax = Integer.MIN_VALUE;
        int posMin = Integer.MAX_VALUE;
        int countNeg = 0, countZero = 0;
        int product = 1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                countZero++;
                continue;
            }
            if(a[i]<0){
                countNeg++;
                negMax = Math.max(negMax,a[i]);
            }
            if(a[i]>0 && a[i]<posMin){
                posMin = a[i];
                product *= a[i];
            }
            if(countZero==n || (countNeg==0 && countZero>0))  return 0;
            if(countNeg==0) return posMin;
//            if(countNeg%2==0 && countNeg!=0)    product = product/negMax;
        }
        return product;

    }
}
/*
    given an array a, we have to find a minimum product possible with the subset of elements present in the array.
    the minimum product can be a single array also

    Input : a[] = { -1, -1, -2, 4, 3 }
    Output : -24
    Explanation : Minimum product will be ( -2 * -1 * -1 * 4 * 3 ) = -24

    Input : a[] = { -1, 0 }
    Output : -1
    Explanation : -1(single element) is minimum product possible

     Input : a[] = { 0, 0, 0 }
    Output : 0

    if there are even number of negative numbers and non zeros, the result is product of all except maximum negative number
    if there are all odd number of negative numbers and no zero, the result is simply the product of all
    if there are zeros and positive, no negative, the result is 0
    if there is no negative number and all other elements positive then our result should be the first minimum positive
    number
    if there are negative number and zeros

*/