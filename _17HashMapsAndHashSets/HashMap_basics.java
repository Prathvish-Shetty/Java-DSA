package _17HashMapsAndHashSets;

import java.util.HashMap;

public class HashMap_basics {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a"); // insertion of pair or updation of value
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"a");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("a"));
        System.out.println(map.size());
        System.out.println(map.remove(1));  // removes the pair & returns value or that key
        System.out.println(map.get(2)); // give the value of that key
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

//        how to iterate a a hashmap
        for(int key : map.keySet())
            System.out.println(key+" : "+map.get(key));
        System.out.println();
        for(int key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+" : "+value);
        }
        System.out.println();
        for (Object pair : map.entrySet())
            System.out.println(pair);
        System.out.println();
    }
}
/*
    insert, remove, search with TC O(1)
    in hashmaps we insert key, value pairs
    keys are unique, values can be duplicate
 */
