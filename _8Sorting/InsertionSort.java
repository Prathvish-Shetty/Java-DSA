package _8Sorting;

public class InsertionSort {
    /*
        TC = O(n^2) -> best case = O(n)
        n(n-1)/2 max swaps
        Stable Sort
        always optimised
    */
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
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int t = arr[i];
//            int j = i-1;
//            while (j>=0){
//                if (t<arr[j])   arr[j+1] = arr[j];
//                else break;
//                j--;
//            }
//            arr[j+1] = t;
//        }

//        for (int i = 1; i < n; i++) {
//            int t = arr[i];
//            int j = i-1;
//            while (j>=0 && t<arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = t;
//        }

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

//
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j > 0 ; j--) {
//                if (arr[j] < arr[j-1])  swap(arr,j-1,j);
//                else break;
//            }
//        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                swap(arr,j-1,j);
            }
        }
        print(arr);
    }

}
