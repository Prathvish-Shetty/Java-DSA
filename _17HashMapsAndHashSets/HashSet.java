package _17HashMapsAndHashSets;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
//        insert O(1)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);    // O(1)
        System.out.println(set.size());
//        search O(1)
        System.out.println(set.contains(10));   // O(1)
        System.out.println(set.remove(40)); // O(1)

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int ele : set)
            System.out.print(ele+" ");
        System.out.println();

//        set.clear();

        set.add(10);
        System.out.println(set);

        java.util.HashSet<String> hs = new java.util.HashSet<>();
        hs.add("sam");
        hs.add("ram");
        hs.add("Ram");
        hs.add("tam");
        System.out.println(hs);
    }
}
/*
    Hashsets are interface in java
    insert, remove, search, size operations in O(1) time
    set is unordered
    we cannot traverse hashset using for/while loop.but by for each loop. because there is no concept of index
    we cannot add or remove any element in set while printing
    In hashset occurrence of every element is 1
*/
