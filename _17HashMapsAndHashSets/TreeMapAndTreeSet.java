package _17HashMapsAndHashSets;

import java.util.TreeMap;

public class TreeMapAndTreeSet {
    public static void main(String[] args) {
        /*
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        for(int ele : set) System.out.print(ele+" ");
        System.out.println();
         */

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        for(int key : map.keySet()) System.out.println(key+" : "+map.get(key));
        for(Object pair : map.entrySet()) System.out.println(pair);
        System.out.println(map);
    }
}
/*
    TreeMap & TreeSet
    insert, remove, search : O(logn)
    it is sorted
    implemented using balanced binary search tree
    if string is used as key there lexographical sorting

    TreeSet, TreeMap are ordered
    HashSet, HashMap are unordered
*/
