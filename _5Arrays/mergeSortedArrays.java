package _5Arrays;

public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,6,7,8};
        int l = a.length,m = b.length,n = l+m;
        int[] c = new int[n];

        int i = 0,j = 0,k = 0;
        while(i<l && j<m){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
            if(i == l) while (j<m) c[k++] = b[j++];// take elements from b only as a is exhausted
            if(j == m) while (i<l) c[k++] = a[i++];// take elements from a only as b is exhausted
        }
        for(int e : c) System.out.print(e+" ");
    }
}
