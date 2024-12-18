package _6TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class twoDArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);b.add(60);

        List<Integer> c = new ArrayList<>();//initial size is 0

        List<Integer> d = new ArrayList<>();
        d.add(70);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);

        for (List<Integer> integers : l) {
            System.out.println(integers);
        }
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        System.out.println(l.get(1).get(1));
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
        /*
            Basic STL methods in ArrayList
            add()   remove()    get()   size()  clear()  isEmpty()  Contains()  indexOf()   toArray()-convert 1D ArrayList to Array
        */
//        Pascal's triangle unoptimized
        class Solution {
            public List<List<Integer>> generate(int n) {
                List<List<Integer>> ans = new ArrayList<>();
                for(int i = 0;i < n;i++){
                    List<Integer> l = new ArrayList<>();
                    for(int j = 0;j <= i;j++){
                        l.add(1);
                    }
                    ans.add(l);
                }
                for(int i = 2;i < n;i++){
                    for(int j = 1;j <= i-1;j++)
                        ans.get(i).set(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
                return ans;
            }
        }
    }
}
