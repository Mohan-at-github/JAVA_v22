package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> studentMap=new LRUCache<>(3);
        studentMap.put("BOB", 92);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Vipul", 89); //BOB removed here only

        System.out.println(studentMap.get("BOB")); //returns null
        System.out.println(studentMap);

        //eg:02
        studentMap.put("BOB", 92);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        System.out.println(studentMap.get("BOB")); //BOB was on top but now its not LRU so moved to bottom
        studentMap.put("Vipul", 89); //Bob moved to bottom so Alice is on top so alice is removed
        System.out.println(studentMap);
    }
}
