package Collections.Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1=new String("Key");
        String key2= new String("Key");
        //hash code of memeory address of key not key content
        //.equals will not work for update only == will work of updating value for a key
        //same memory address of key then update the value
        Map<String, Integer> map=new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
