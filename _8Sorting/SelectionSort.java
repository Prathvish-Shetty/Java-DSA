package _8Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
//    In every pass we find the kth smallest element and put it in its right place
    /*
        TC = O(n^2) (all cases)
        SC = O(n)
        Auxillary Space = 0
        unstable sort
        cannot be optimised like bubble sort
        number of swaps are less - n-1
    */
    public static void main(String[] args) {
        int[] arr = {5,4,0,-3,7,8,9};
        print(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex])     minIndex = j;
            }
            swap(arr,i,minIndex);
        }
//        find kth largest element and put it in its correct place
        for (int i = n -1; i > 0; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxIndex])     maxIndex = j;
            }
            swap(arr,i,maxIndex);
            print(arr);
        }
        print(arr);

    }
}
