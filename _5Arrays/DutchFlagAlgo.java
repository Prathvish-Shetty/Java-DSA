package _5Arrays;
import java.util.*;

public class DutchFlagAlgo {
    public static void main(String[] args) {
//            Colours in leetcode
//    Sort array of 0's 1's 2's
        int[] arr = {0,1,2,0,1,2,0,1,2};
        int n = arr.length;
        int noz = 0,noo = 0,not = 0;
        for(int i = 0; i < n; i++){
            if (arr[i] == 0) noz++;
            else if (arr[i] == 1 ) noo++;
            else not++;
        }
        for(int i = 0;i<n;i++){
            if(i<noz) arr[i] = 0;
            else if (i<noz+noo) arr[i] = 1;
            else arr[i] = 2;
        }
        for(int i : arr) System.out.print(i+" ");
//        Three pointer approach-divide the array into 4 parts
//        0 to lo-1 : 0
//        lo to mid-1 : 1
//        mid to hi : unsorted part
//        hi+1 to n-1 : 2
//        000 111 012 222
//        when mid > hi arrag is sorted
    }
}
