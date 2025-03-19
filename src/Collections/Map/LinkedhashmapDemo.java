package Collections.Map;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashmapDemo {
    public static void main(String[] args) {
        //insertion order ius maintained
        LinkedHashMap<Integer,String> hashMap=new LinkedHashMap<>(10,0.3f,true);
        hashMap.put(1, "mohan");
        hashMap.put(3, "Lohith");
        hashMap.put(2, "Suhas");
        System.out.println(hashMap);

        //insertion order not maintained
        HashMap<Integer,String> hashMap1 =new HashMap<>();
        hashMap1.put(1, "mohan");
        hashMap1.put(3, "Lohith");
        hashMap1.put(2, "Suhas");
        System.out.println(hashMap1.getOrDefault(4,"Ajay"));
        System.out.println(hashMap1);

        hashMap1.putIfAbsent(3, "Raju"); //update only if value not present
        hashMap1.put(2, "Ramesh"); //update it
        System.out.println(hashMap1);

        System.out.println(hashMap.get(3));
        System.out.println(hashMap); //if access order is ture then used entry moved to end of hashMap


    }
}

