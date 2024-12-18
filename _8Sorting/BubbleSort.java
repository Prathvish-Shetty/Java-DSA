package _8Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
        //    check if the array is sorted or not
        //Any given array is said to be sorted if arr[i] <= arr[i+1]
        int[] arr = {1,7,3,8,9,2};
        int n = arr.length;
        boolean isSorted = true;
        for(int i = 0;i < n-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) System.out.println("Array is sorted");
        else System.out.println("Array is unsorted");
*/

        int[] arr = {1,7,3,8,9,2};
        int n = arr.length;
        print(arr);

/*
        Bubble Sort
        n-1 passes
        TC = O(n^2) (best case O(n)-alreadu sorted)
        SC = O(n) given array of n size
        Auxillary Space = O(1)
        Stable sort - relative order of same elements is maintained after sorting
        maximum number of swaps = n(n-1)/2
        extra variable needed for optimising
*/
        for (int i = 0; i < n-1; i++) {
            boolean isSorted = true;
            for(int j = 0;j < n-1-i;j++){
                if (arr[j] > arr[j+1]){
//                    if (arr[j] < arr[j+1]){   sort the largest element
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    isSorted = false;
                }
            }

            if (isSorted) break;
        }
        print(arr);

    }
}
