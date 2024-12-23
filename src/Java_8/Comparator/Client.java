package Java_8.Comparator;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(6);
        list.add(89);
        list.add(56);
        list.add(2);
        list.add(79);
        Collections.sort(list);
        System.out.println(list);
        //to sort in desc we need to use comparator interface

        //WITHOUT JAVA 8
        ComparatorImpl comparator=new ComparatorImpl();
        list.sort(comparator);
        System.out.println(list);

        //with JAVA 8
        Collections.sort(list,(a,b)->b-a);
        //or
        list.sort((a, b) -> b - a);
        System.out.println(list);



    }
}
