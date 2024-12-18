package _26Hashing;

import java.util.Arrays;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,5,4,5,2,4,9,5};
        int[] hash = new int[10];
        for (int j : arr) {
            hash[j]++;
        }
//        int[] a = new int[100000000];
//        System.out.println(a.length);

        String s = "alphabets";
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[(c-'a')]++;
        }
        System.out.println(Arrays.toString(freq));

//        if we don't know which characters are there take 256 size array
        int[] h = new int[256];
        for(char c : s.toCharArray()){
            h[c]++;
        }
//        System.out.println(Arrays.toString(h));
    }
}
/*
    Hashing = Pre storing and fetching
    number hashing, character hashing
    unordered map/hashmap : store, fetch best,avg = 1, worst n due to collisions
    ordered map/treemap : store, fetch logn time

    hashing methods :
        division method(10 sized hash,number stored in n%10,numbers chaining like linked list)
        folding method
        mod square method

     0 : 10-> 10-> 20..

     if all elements in array go to same hash place i.e have same remainder - this is collision

 */