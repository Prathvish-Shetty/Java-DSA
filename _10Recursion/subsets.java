package _10Recursion;

import java.util.ArrayList;

public class subsets {
//    Print all increasing sequences of length k from first n natural numbers
//    print(1,k,n,"")
    /*
        1234
        1235
        1236
        1245
        1246
        1256
        1345
        1346
        1356
        1456
        2345
        2346
        2356
        3456
    */

    static ArrayList<String> al1 = new ArrayList<>();    // global
    static ArrayList<ArrayList<Integer>> al2 = new ArrayList<ArrayList<Integer>>();    // global

    private static void printSubsets(String s, int i, String ans) {
        if (i == s.length()){
//            System.out.println(ans);
            al1.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(s,i+1,ans);    // not take
        printSubsets(s,i+1,ans+ch);    // take
//        changing the order of above two statements changes the order of answers
    }
    private static void printSubsets(int[] a, int i, ArrayList<Integer> al) {
        if (i == a.length){
            ArrayList<Integer> ans = new ArrayList<>();
            for (int j = 0;j<al.size();j++){
                ans.add(al.get(j));
            }
//            ans.addAll(al);
            al2.add(ans);
            return;
        }
        printSubsets(a,i+1,al);    // not take
        int n = a[i];
        al.add(n);
        printSubsets(a,i+1,al);    // take
        al.remove(al.size()-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        al1 = new ArrayList<>(); // reset the arraylist
        printSubsets(s,0,"");
        System.out.println(al1);

        int[] a = {1,2,3};
        al2 = new ArrayList<ArrayList<Integer>>(); // reset the arraylist
        ArrayList<Integer> arl = new ArrayList<>(0);
        printSubsets(a,0,arl);
        System.out.println(al2);
    }
}
//  String is pass by value
//  Array and arraylist are pass by reference