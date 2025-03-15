package Collections;

import java.util.Arrays;
import java.util.LinkedList;

//Node of the linked List
class Node{
    public int vlaue;
    public Node next;
}
public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 =new Node();
        Node node2 =new Node();
        node1.vlaue=2;
        node1.next=node2;
        node2.vlaue=3;
        node2.next=null;

        //or

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(13);
        linkedList.add(24);
        linkedList.addLast(20);
        linkedList.addFirst(0);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getLast());

        System.out.println(linkedList);

        System.out.println(linkedList.remove(4));
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animalsList=new LinkedList<>(Arrays.asList("Lion","Tiger","Dog"));
        System.out.println(animalsList);
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("Dog","Cat"));
        animalsList.removeAll(animalToRemove);
        System.out.println(animalsList);

    }
}
