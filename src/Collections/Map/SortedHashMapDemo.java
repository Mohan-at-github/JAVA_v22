package Collections.Map;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedHashMapDemo {
    public static void main(String[] args) {
        //sorting based on key only
        SortedMap<String,Integer> map=new TreeMap<>(); //asc order
        map.put("Mohan", 10);
        map.put("Suhas", 2);
        map.put("Abhi", 22);
        map.put("yash", 46);
        System.out.println(map);


        SortedMap<String,Integer> map1=new TreeMap<>(Comparator.reverseOrder()); //desc order
        //internal impl of treemap is Red Black Tree: self-balancing Binary search tree
        map1.put("Mohan", 10);
        map1.put("Suhas", 2);
        map1.put("Abhi", 22);
        map1.put("yash", 46);
        System.out.println(map1);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Suhas")); //exclude and print above this
        System.out.println(map.tailMap("Mohan")); //include and print below this

        NavigableMap<Integer,String> navigableMap=new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(3, "three");
        navigableMap.put(2, "two");
        System.out.println(navigableMap);
        System.out.println(navigableMap.headMap(2));
        System.out.println(navigableMap.tailMap(2));
        System.out.println(navigableMap.lowerKey(3));




    }
}
