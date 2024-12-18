package _10Recursion;

public class Traversal {
//    Array traversal
    private static void print(int[] a,int i){
        if (i == a.length)  return;
        System.out.print(a[i]+" ");
        print(a,i+1);
    }
//    String Traversal
private static void print(String s,int i){
    if (i == s.length())  return;
    System.out.print(s.charAt(i)+" ");
    print(s,i+1);
}
private static void skipA(String s,int i,String ans){   // TC = O(n)
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a')     ans += s.charAt(i);
        skipA(s,i+1,ans);
//        if (s.charAt(i) != 'a')     skipA(s,i+1,ans + s.charAt(i));
//        else skipA(s,i+1,ans);
}
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        print(a,0);
        System.out.println();
        String s = "Raghav Garg";
        System.out.println(s);
        print(s,0);
        System.out.println();
        skipA(s,0,"");
    }
}
