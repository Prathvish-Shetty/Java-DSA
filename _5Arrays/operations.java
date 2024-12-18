package _5Arrays;

import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Input
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];   // when array is initialized - by default 0 is assigned to it
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //      Linear Search
        System.out.print("Enter target element: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if(a[i] == key){
                found = true;
                break;
            }
        }
        if (found) System.out.println("Target element found");
        else System.out.println("Target element not found");


        //        Find maximum element
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[maxIndex]) maxIndex = i;
        }
        System.out.println("Maximum Element is "+a[maxIndex]);
        //        OR
        int mx = a[0];
        for (int i = 1; i < n; i++) {
//            if (a[i] > mx) mx = a[i];
            mx = Math.max(mx,a[i]);
        }
        //        System.out.println("Maximum Element is "+mx);
//        OR
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
//        System.out.println("Maximum Element is "+max);


        //      Find min element
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[minIndex]) minIndex = i;
        }
        System.out.println("Minimum Element is "+a[minIndex]);

//      Find second largest element
        mx = a[0];
        int smx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
//            if (a[i] > mx) mx = a[i];
            mx = Math.max(a[i],mx);
        }
        for (int i = 1; i < n; i++) {
//            if (a[i] > smx && i!=mx)) smx = a[i];
            if(a[i] != mx) smx = Math.max(a[i],smx);
        }
        if (smx == Integer.MIN_VALUE) System.out.println("Second Maximum Element is "+mx);
        else System.out.println("Second Maximum Element is "+smx);

//        Alternative

        mx = a[0];
        smx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(a[i]>mx){
                smx = mx;
                mx = a[i];
            } else if (a[i] > smx && a[i] != mx){
                smx = a[i];
            }
        }
        if (smx == Integer.MIN_VALUE) System.out.println("Second Maximum Element is "+mx);
        else System.out.println("Second Maximum Element is "+smx);

        //        Check whether all elements of the array are same
        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if(a[i] != a[0]){
                allSame = false;
                break;
            }
        }
    }

}
