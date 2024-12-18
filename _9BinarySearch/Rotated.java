package _9BinarySearch;

public class Rotated {
    /*
        Aggressive cows
        Koko eating Bananas
        Min time to complete trips
     */
    public static void main(String[] args) {
//        Search in rotated arrays
//        3 4 5 6 7 0 1 2 3
/*        Method1
            1 find the pivot index O(logn)
            Binary Search in (0,p) & (p+1,n-1)
            there are 2 pivots one greater than left and right , another lesser than left and right
            largest element can be the pivot or smallest
 */
    }
    static class Solution {
        public int bs(int[] a,int s,int e,int t){
            while(s<=e){
                int m = s+(e-s)/2;
                if(a[m] == t)   return m;
                else if(a[m]>t)     e = m-1;
                else    s = m+1;
            }
            return -1;
        }
        public int search(int[] arr, int t) {
            // find pivot-greatest as pivot
            int n = arr.length;
            if(n<3){
                for(int i = 0;i<n;i++){
                    if(arr[i] == t) return i;
                }
                return -1;
            }
            int s = 1,e = n-2,p = -1;//pivot can be first or last element for size < 3
            while(s<=e){
                int m = s+(e-s)/2;
                if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                    p = m;break;
                }
                else if(arr[m]<arr[m-1] && arr[m]<arr[m+1]){
                    p = m-1;break;
                }
                else if(arr[m]>arr[m-1] && arr[m]<arr[m+1]){
                    if(arr[m]>arr[n-1]) s = m+1;    // we are in left half
                    else e = m-1;   // we are in right half of pivot
                }
            }
            if(p==-1){// array was not rotated so apply normal binary search
                return bs(arr,0,n-1,t);
            }
            int left = bs(arr,0,p,t);
            if(left != -1)  return left;
            int right = bs(arr,p+1,n-1,t);
            return right;
        }
    }
}
