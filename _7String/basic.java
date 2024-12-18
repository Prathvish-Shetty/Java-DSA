package _7String;
import java.util.Locale;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'p','a','t','t','u'};
        for(char ele : arr) System.out.print(ele);
        System.out.println();
        String name = "pattu";
        System.out.println(name);
        System.out.println("Enter your name : ");
//        String nm = sc.next();    //input word
        String nm = sc.nextLine();    //input sentence
        System.out.println("Hello "+nm);

        /*
        Built in string methods
        s.charAt(index);
        int l = s.length();
        s.indexOf('a'); return first index
        s.lastIndexOf('a');
        compareTo() is used to compare 2 given strings lexographically(alphabetically/dictionary wise)
        s.contains("ab")    return boolean value
        s.startsWith("A");  return boolean value
        s.endsWith("A");  return boolean value
        s.toLowerCase() either store or directly print
        s.toUpperCase() either store or directly print
        a = a.concat(b)
        a = a.concat(10) not possible
        Substring is a continuous part of string of whatever length
        String x = "" empty string
        "abcd"
        Substrings{a,ab,abc,abcd,b,bc,bcd,c,cd,d,""}
        */

//        Count Vowels
        String str = nm.toLowerCase(Locale.ROOT);
        int cnt = 0;
        for (int i = 0; i < nm.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch))
                cnt++;
        }
        System.out.println(cnt);

        String a = "abc";
        String b = "dbc";
        String c = a + b + 10 + 'z';
        System.out.println(a.compareTo(b)); //returns the ascii value difference when length is not same remaining length is returned

        String st = "abcde";
        System.out.println(st.substring(1)); //till end
        System.out.println(st.substring(1,4)); // i to j-1
        System.out.println();
//        find all substrings
        for (int i = 0; i < st.length(); i++) {
            for (int j = i+1; j <= st.length(); j++) {
                System.out.print(st.substring(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println("abc" + 10 + 20);
        System.out.println(10 + 20 + "abc");

//        convert int to string
        int n = 10;
//        String sn = n + "";
        String sn = Integer.toString(n); //Long.toString()
        System.out.println("No of digits are "+sn.length());

//        Strings are immutable in java
//        sn.charAt(0) = 'M'; // error

        String stn = "Raghav";
        String q = "Raghav"; //no new string is created
        q = stn;
        String t = new String("Raghav");
        stn = "Madhav"; // instead of pointing to raghav stn is pointing to Madhav-Raghav is not overwritten
//        Interning is done to save space
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')   return true;
        return false;
    }
}
