package _11AdvancedSorting;

public class Inversion {
    public static void print(int[] arr){
        for(int e:arr)
            System.out.print(e+" ");
        System.out.println();
    }
    static int count = 0;
//    public static void inversion(int[]a,int[]b){
//        int i = 0,j = 0;
//        while(i<a.length && j<b.length){
//            if (a[i]>b[j]){
//                count += a.length-i;
//                j++;
//            }
//            else    i++;
//        }
//    }
    public static void merge(int[] a,int[] b,int[] c){
        int i = 0,j = 0,k = 0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j])  c[k++] = a[i++];
            else{
                count += a.length-i;
                c[k++] = b[j++];
            }
        }
        while (i<a.length)  c[k++] = a[i++];
        while (j<b.length)  c[k++] = b[j++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1)    return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i = 0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i = 0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
//        inversion(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        /*
            you have to count the number of inversions where i<j & arr[i]>arr[j]
            int[] arr = {4,1,3,2};
            (4,3),(4,2),(4,1),(3,2)
            inversion count = 4
        */
        /*
//        Brutforce approach TC = O(n^2) , SC = O(1)
        int[] arr = {4,1,3,2};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j])    count++;
            }
        }
        System.out.println("Inversion count is : "+count);
        */

//        int[] a = {8,3,5,2,6,1,7,4};
//        int[] a = {4,1,3,2};
        int[] a = {109,33,89,27,60,10,70};
        print(a);
        mergeSort(a);
        print(a);
        System.out.println(count);
//        O(nlogn)
    }
}
