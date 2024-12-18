package _5Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {99,85,55,47,77,68,32,20};
        int l = arr.length;
//        for (int i = 0; i < l ; i++) {
//            if (arr[i] < 35) System.out.print(i+" ");
//        }
//        System.out.println();

//    reverse the array without using another array
//        Using two pointer approach
        for(int s = 0,e = l-1 ; s<e;s++,e--){
//            swapping
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
        }
//        using while loop
//        we can also reverse a part of ann array by changing the values of s & e
        int s = 0,e = l-1 ;
        while(s <= e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;e--;
        }

//        another approach
        for(int i = 0;i<l/2;i++){
            int j = l-i-1;
//            swapping
            swap(arr,i,j);
        }

        System.out.print("Elements of array are : ");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
