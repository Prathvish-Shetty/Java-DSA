package _7String;

public class string1 {
    public static void main(String[] args) {
        /*
        //        String in java is immutable-hence cannot be sorted
        String s = "raghav";
        char[] ch = s.toCharArray();
//        char[] ch ={'d','c','b','a'};
        System.out.println(ch);
        System.out.println();
        Arrays.sort(ch);
        for(char c : ch) System.out.print(c);
        StringBuilder sb = new StringBuilder("garg") ;
        char[] c = sb.toString().toCharArray();

//        Array of Strings
        String[] as = {"rati","ardharathi","maharathi"};
*/
/*
        String st = "rajvikramaditya";
        int[] freq = new int[26];
        for(int i = 0;i<st.length();i++){
            char cr = st.charAt(i);
            int ci = (int)cr - 97;
            freq[ci]++;
//            freq[(int)st.charAt(i) - 97]++;
        }
        int mx = -1;
        for (int j : freq) {
            mx = Math.max(mx, j);
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == mx) System.out.println((char)(i+97)+" ");
        }
*/
        /*
//      string to integer
        String s = "9844";
        int n = Integer.parseInt(s);
        System.out.println(n);

        String[] arr = {"455","11534","95354","0025","-6556"};
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            int nm = Integer.parseInt(arr[i]);
            mx = Integer.max(nm,mx);
        }
        System.out.println(mx);
*/
//        find max
        String[] arr = {"455","11534","95354","0025","-6556"};
        String maxS = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);

//        find min
        String minS = arr[0];
        for (int i = 0;i<arr.length;i++){
            minS = min(minS,arr[i]);
        }
        System.out.println(minS);
    }
    public static String max(String a,String b){
        String s = purify(a),t = purify(b);
        if (s.length() > t.length())  return a;
        if (s.length() < t.length())  return b;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) != t.charAt(i)){
                if (s.charAt(i) > t.charAt(i))  return a;
                else return b;
            }
        }
        if (a.length() >= b.length())   return a;
        else return b;
    }
    public static String min(String a,String b){
        String s = purify(a),t = purify(b);
        if (s.length() > t.length())  return b;
        if (s.length() < t.length())  return a;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) != t.charAt(i)){
                if (s.charAt(i) > t.charAt(i))  return b;
                else return a;
            }
        }
        if (a.length() >= b.length())   return b;
        else return b;
    }
    public static String purify(String a){//remove leading zeros
        for (int i = 0;i<a.length();i++){
            if (a.charAt(i) != '0') return a.substring(i);
        }
        return a;
    }
}
