package _11AdvancedSorting;

public class Merger2SortedArrays {
    public static void print(int[] arr){
        for(int e:arr)
            System.out.print(e+" ");
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;k++;
            }
            else {
                c[k] = b[j];
                j++;k++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            k++;i++;
        }
        while(j<b.length){
            c[k] = b[j];
            k++;j++;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        print(a);
        print(b);
        int[] c = new int[a.length + b.length];
        merge(a,b,c);
        print(c);
    }
}
