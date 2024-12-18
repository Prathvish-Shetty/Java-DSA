package _11AdvancedSorting;

public class QuickSort {
    /*
        avg TC = O(nlogn)
        recursive callstack space = O(logn)
        wirst case:
        TC for already sorted array = O(logn)
        recursive callstack space = O(n)
        instead of choosing arr[0] as pivot we can choose arr[s+e]/2 as pivot as it performs best for most of the case
    */
        /*
        avg TC = O(nlogn)
        recursive callstack space = O(logn)
        wirst case:
        TC for already sorted array = O(n^2)
        recursive callstack space = O(n)
        instead of choosing arr[0] as pivot we can choose arr[s+e]/2 as pivot as it performs best for most of the cases
        TC = O(nlogn)
        SC = O(logn)
    */
    public static void print(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static int partition(int[] arr, int s, int e) {
//        taking first element as pivot
        int pivot = arr[s], pivotIndex = s;
        int smallerCount = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) smallerCount++;
        }
        int correctIndex = pivotIndex + smallerCount;

//        randomised qs
//        int m = (s+e)/2;
//        int pivot = arr[m],pivotIndex = m;
//        int smallerCount = 0;
//        for (int i = s; i <= e; i++) {
//            if (i == m) continue;
//            if (arr[i]<=pivot) smallerCount++;
//        }
//        int correctIndex = s+smallerCount;

//        swap arr[pivotIndex] and arr[correctIndex]
        swap(arr, pivotIndex, correctIndex);
//        partition
        int i = s, j = e;
        while (i<correctIndex && j>correctIndex) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i] > pivot & arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
//        print(arr);
        return correctIndex;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e) return;
//        place pivot(a[s]) in its correct index
//        left part<=pivot
        int pivotIndex = partition(arr, s, e);
        quickSort(arr, s, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, e);
    }

    public static void main(String[] args) {
        /*
            let first element be pivot
            first find number of elements smaller than it
            move it to its correct position
            use two pointer approact such that all elements to its left must be smaller than it
            and all elements to its right must be greater than it
            recursion
        */
        int[] arr = {3,3,3,3,4,3,3,3,3};
//        {9,2,1,5,6,4,3};
//        int[] arr = {9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        print(arr);
        quickSort(arr, 0, n-1);
        print(arr);
    }
}
/*
    QS is unstable
 */