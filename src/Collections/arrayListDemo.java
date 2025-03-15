package Collections;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        //adding elements to ArrayList
       List<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(80);
       list.add(99);

        //adding one ArrayList to another ArrayList
       List<Integer> list1=Arrays.asList(6,7,4,3); // only updating existing element is possible
       List<Integer> list2=List.of(10,20,30,40); // modification is not possible
       list.addAll(list1);
        System.out.println(list);

        //to update a element for a particular Index
        list.set(2, 2003);
        System.out.println(list);

        //Printing ArrayList
       System.out.println(list.get(1));
       list.add(1,20);

        System.out.println(list.get(1));
        System.out.println(list.get(4));
        System.out.println("");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator: "+it.next());
        }

        //Removing element from Arraylist
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        list.remove(4); //removing element using Index
        System.out.println(list);

        //Checking element present in ArrayList
        System.out.println(list.contains(80));
        System.out.println(list.contains(290));

        //clearing entire ArrayList
        list.clear();
        System.out.println(list);

        List<Integer> List4=new ArrayList<>(1000);

    }
}
