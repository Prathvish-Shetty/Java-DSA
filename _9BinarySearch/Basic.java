package _9BinarySearch;

public class Basic {
    public static void print(int[] arr){
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
            TC O(logn)
        */
//        int[] a = {1,2,3,3,4,5,6,7,8,9};
//        int k = 5;
//        int s = 0,e = a.length-1;
//        boolean found = false;
//        while (s <= e){
//            int m = s+(e-s)/2;
//            if (a[m] == k){
//                found = true ;
//                break;
//            }
//            else if (a[m]>k) e = m-1;
//            else s = m+1;
//        }
//        if (found == true) System.out.println("Element found");
//        else System.out.println("Element not found");

        /*
            given a sorted integer array and an integer 'x',find the lower bound of x
            smallest index such that arr[index]>=x
            if found return least index of that element
            if not present and smaller than smallest return 0 as index
            if not present and greater than largest return array size as index
        */

        int[] a = {10,20,30,30,40,50,60,70,80,90};
        int k = 5;
        int s = 0,e = a.length-1;
        int lb = a.length; // lower bound
        while (s <= e){
            int m = s+(e-s)/2;
            if (a[m] >= k){
                lb = Math.min(lb,m);
                e = m-1;
            }
            else s = m;
        }
        System.out.println(lb);

        /*
            given a sorted integer array and an integer 'x',find the upper bound of x
            smallest index such that arr[index]>x
            if found return least index of that element
            if not present and smaller than smallest return 0 as index
            if not present and greater than largest return array size as index
        */
//        element not present in an array has same upper and lower bound
//        same code as lower bound
        s = 0;e = a.length-1;
        int ub = a.length;;
        while (s <= e){
            int m = s+(e-s)/2;
            if (a[m] > k){
                ub = Math.min(ub,m);
                e = m-1;
            }
            else s = m;
        }
        System.out.println(ub);
    }

}
