package _11AdvancedSorting;

public class MergeSort {
    /*
        divide and conquer
        TC = O(nlogn) for best,average,worst case
        there are logn+1 levels,TC = 2*(l-n)*n
        SC = (l-1)*n = n*logn , no extra space for first level
        we can improve it by deleting a & b after merging into arr
        after improving space complexity is O(n) for all cases
        Merge sort is stable sort-relative order of duplicate elements is maintained
        make sure to code like this if(a[i]<=b[j]) c[k++] = a[i++]
        if we use < instead of <= then it wont be stable

     */
    public static void print(int[] arr){
        for(int e:arr)
            System.out.print(e+" ");
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){
            if (a[i] <= b[j])   c[k++] = a[i++];
            else    c[k++] = b[j++];
        }
        while(i<a.length)   c[k++] = a[i++];
        while(j<b.length)   c[k++] = b[j++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1) return;
//        create 2 arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
//        copy pasting
        for(int i = 0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i = 0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
//        magic
        mergeSort(a);
        mergeSort(b);
//        merge these 'a' & 'b'
        merge(a,b,arr);
//        delete a & b
        a = null;b = null;
    }

    public static void main(String[] args) {
        int[] a = {8,3,5,2,6,1,7,4};
        print(a);
        mergeSort(a);
        print(a);
    }
}
/*
    O(nlogn) worst case TC
    custom sorting
    sorting linked lists
    inversion count and related problems
*/




