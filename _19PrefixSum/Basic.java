package _19PrefixSum;

public class Basic {
    public static void main(String[] args) {

    }
}
/*
prefix sum
    arr = {5,1,8,2,4,3,2};
prefix sum array
    psa = {5,6,14,16,20,23,25};

    psa[i] = arr[i] + pre[i-1]

suffix sum array
    ssa = {25,20,19,11,9,5,2};
    ssa[i] = arr[i] + ssa[i+1]

prefix product array
    ppa = {5,5,40,80,320,960,1920}
    pre[i] = arr[i]*pre[i-1]

suffix product array
    spa = {1920,384,384,48,24,6,2}
    spa[i] = arr[i] + spa[i+1]

    sub array and substring are continuous parts of array and string
*/
