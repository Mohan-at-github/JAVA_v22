package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        //copy on write : create a snapshot for every update
        //once update is done then changes the reference to new modified List
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();

        list.add("Egg");
        list.add("Bread");
        list.add("salt");
        for(String list1:list){
            if(list1.equals("Bread")){
                list.add("Better");
            }
            System.out.println("items are "+list1);
        }
        System.out.println("updated items "+ list);

        //ArrayList : can throw exception or update will not be proper
        ArrayList<String> list2=new ArrayList<>();

        list2.add("Egg");
        list2.add("Bread");
        list2.add("salt");
        for(String list1:list2){
            if(list1.equals("Bread")){
                list.add("Better");
            }
            System.out.println("items are "+list1);
        }
        System.out.println("updated items "+ list2);
    }
}
