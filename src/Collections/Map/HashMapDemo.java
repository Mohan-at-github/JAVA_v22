package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "mohan");
        map.put(2, "Lohith");
        map.put(3, "Ramesh");
        map.put(4, "suhas");
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("mohan"));
        System.out.println(map.containsValue("Ajay"));

        Set<Integer> set=map.keySet();
        System.out.println(set);

        Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
        System.out.println(entrySet);

        System.out.println("map size: "+map.size());

        System.out.println(map.get(4));
        System.out.println(map.get(5));

        System.out.println(map.remove(3));
        System.out.println(map);

        System.out.println(map.remove(2, "Lohith"));
        System.out.println(map);
    }
}
