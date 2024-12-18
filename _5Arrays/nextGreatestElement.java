package _5Arrays;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int n = a.length;
        int[] b = new int[n];
        b[n-1] = -1;
        int[] c = new int[n];
        c[0] = -1;
//        Brut force
//        for (int i = 0; i < n-1; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1;j<n;j++){
//                if (a[j] > max) max = a[j];
//            }
//            b[i] = max;
//        }
//        for(int e : b) System.out.print(e+" ");

//        Optimised
        int nge = a[n-1];     // next greatest element
        for (int i = n-2;i>=0;i--){
            b[i] = nge;
            nge = Math.max(nge,a[i]);
        }
        for(int e : b) System.out.print(e+" ");
        System.out.println();
//        previous greatest element
        int pge = a[1];
        for (int i = 1;i<n;i++){
            c[i] = pge;
            pge = Math.max(pge,a[i]);
        }
        for(int e : c) System.out.print(e+" ");













//        Previoua greatest element
    }
}
