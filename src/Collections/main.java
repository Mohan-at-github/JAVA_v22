package Collections;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();
       map.put(100,"A");
        map.put(50,"B");
        map.put(10,"C");
        map.put(20,"D");
        for(Map.Entry<Integer, String> entries : map.entrySet()){
            System.out.println(entries.getKey()+" "+entries.getValue());
        }

    }
}
