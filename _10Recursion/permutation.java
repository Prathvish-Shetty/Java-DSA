package _10Recursion;

public class permutation {  // TC = O(n!)
    private static void perm(String ans, String s) {
        if (s.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            perm(ans+ch,right+left);
        }
    }
    public static void main(String[] args) {
        String s = "abc";   
        perm("",s);
    }
}
//                                    ""/"abc"
//                "a"/"bc"            "b"/"ac"                "c"/"ab"
//        "ab"/"c"    "ac"/"b"    "ba"/"c"    "bc"/"a"    "ca"/"b"    "cb"/"a"
//        "abc"/""    "acb"/""    "bac"/""    "bca"/""    "cab"/""    "cba"/""
//  calls - 1 2 4 8 16 ...
//  TC = O(2^n)