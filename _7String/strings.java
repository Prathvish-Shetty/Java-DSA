package _7String;

public class strings {
    public static void reverse(StringBuilder sb,int s,int e) {
        while (s < e){
            char t = sb.charAt(s);
            sb.setCharAt(s,sb.charAt(e));
            sb.setCharAt(e,t);
            s++;e--;
        }
    }
    public static void main(String[] args) {
        /*
//        We cannot change individual characters in a string,we can but we will waste a lot of time and spacce
        String s = "Hello";
//        change to Heylo i.e change 2nd index to y
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
        s = "CodeHelp";
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (i%2 == 0)   st += 'a';
            else st += s.charAt(i);
        }
        System.out.println(st);
//        Strings have poor performance due to immutability
        s = "abcxyz";
        st = "abcxyz";
        System.out.println(s == st);// true because both have same memory locations
        st = "abc";
        st += "xyz";
        System.out.println(s == st);// false because both have different memory locations
        String sn = new String("abcxyz");
//        String sn = new String(s);
        System.out.println(s == sn); // compares addresses
        System.out.println(s.equals(sn));

//        String Builder and String Buffer both are built in
//        new keyword creates new object
        StringBuilder sb = new StringBuilder("Rahul");
        StringBuilder sb1 = new StringBuilder("");
        System.out.println(sb1.capacity()); // default capacity of string builder is 16
        StringBuilder sb2 = new StringBuilder(10);// creates empty stringbuilder of capacity 10
        System.out.println(sb2.capacity());
        System.out.println(sb.reverse());
//        toUpperCase & toLowerCase not possible in SB
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        StringBuilder sbr = new StringBuilder(str);
        StringBuilder stbr = new StringBuilder(sc.nextLine());
        sb.setCharAt(0,'P');

//        Input a string and toogle all the characters of the string
        int n = stbr.length();
        for(int i = 0;i<n;i++){
            char c = stbr.charAt(i);
            if(c >= 'a' && c <= 'z')    c -= 32;
            else if (c >= 'A' && c <= 'Z')    c += 32;
            stbr.setCharAt(i,c);
        }
        System.out.println(stbr);

        sb.append(10);
        sb.append('s');
        sb.append("xyz");
        System.out.println(sb);
        char[] ch = {'a','b','c'};
        sb.append(ch);
        int[] a = {1,1,2,5,4};
//        sb.append(a); // appends address
        StringBuilder st1 = new StringBuilder("xyz");
        sb.append(st1);
//        sb += "dij" not possible
        sb.deleteCharAt(5); // deletes character at index
        sb.delete(2,5); // delete characters from 2 to 4
        sb.setCharAt(2,'a');
        sb.insert(2,'a');
        sb.insert(2,"erv");
        sb.insert(3,338);
        System.out.println(sb);

        int i = 0,j = sb.length()-1;
        while(i<j){
            char t = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,t);
            i++;
            j--;
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
*/
//        Reverse each word in a given sentence
        StringBuilder sbr = new StringBuilder("abc def ghi");
        int i = 0,j = 0;
//        my code
//        while(j < sbr.length()){
//            while (j < sbr.length() && sbr.charAt(j) != ' '){
//                j++;
//            }
//            reverse(sbr,i,j-1);
//            if (j >= sbr.length()) break;
//            j++;i = j;
//        }
//        optimised
        while (j<sbr.length()){
            if (sbr.charAt(j) != ' ')   j++;
            else {
                reverse(sbr,i,j-1);
                j++;i = j;
            }
        }
        reverse(sbr,i,j-1);

//        do {
//            if (sbr.charAt(j) != ' ')
//                j++;
//            else {
//                reverse(sbr, i, j - 1);
//                j++;
//                i = j;
//            }
//        } while (j < sbr.length());
        System.out.println(sbr);

    }
}


/*
    kmp algorithm for string matching
    lc 214
*/