package _5Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
/*
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        int sum = 0,prod = 1;
        for (int j : array) {
            sum += j;
            prod *= j;
            System.out.print(j + " ");
        }
        System.out.println();
        int[] arr = new int[5]; // declaration and memory allocation
//        initializing individual elements
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        Output
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");

        System.out.println();


//        Best practice
        Scanner sc = new Scanner(System.in);

//        Input
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];   // when array is initialized - by default 0 is assigned to it
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

//        Output
        System.out.print("Elements of array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
*/

//    Built-in methods in array
        int[] arr = {99,85,55,47,77,68,32,20};
        int l = arr.length;
        for (int i = 0; i < l ; i++) System.out.print(arr[i]+" ");
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < l ; i++)   System.out.print(arr[i]+" ");
        System.out.println();

//        for each loop
        for(int element : arr) System.out.print(element+" ");
        System.out.println();

//        copying one array elements to other
        int[] nums = arr;   // shallow copy nums is a reference variable , so any change in either will reflect change in other
        for (int x : nums) System.out.print(x+" ");

        int[] brr = Arrays.copyOf(arr , arr.length);    // deep copy

        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) crr[i] = arr[i];
        for (int x : crr) System.out.print(x+" ");
        System.out.println();

//        Creating ArrayList
//        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<>(6);  // initial capacity is not compulsory, size is the number of elements
        al.add(0 , 10);
        al.add(1 , 20);
        al.add(2 , 30);
        al.add(3 , 40);
        al.add(4 , 50);
        al.add(5 , 60);

        for (int i = 0; i < 6 ; i++) System.out.print(al.get(i)+" ");   //  instead of 6 we can write arr.size()
        System.out.println(al);
        al.set(0 , 15); // update/modify
        al.add(70);  // last element
        System.out.println(al+" "+al.size());
        al.remove(0);
        System.out.println(al+" "+al.size());



    }
}
