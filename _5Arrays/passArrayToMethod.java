package _5Arrays;

public class passArrayToMethod {
    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
        int[] arr = {10,20,30,40,50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

//    public static void change(int x) {    pass by value
//        x = 10;
//    }

//    in java reference variable gets passed
    public static void change(int[] arr){   // array is always passed by reference
        arr[0] = 60;
    }
}
// Arraylist is similar to vector in c++
// In java Array has fixed size so we use dynamic arrays using OOP