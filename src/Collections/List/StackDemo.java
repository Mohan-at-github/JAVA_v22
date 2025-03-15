package Collections.List;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);//0   //7
        stack.push(2);//1   //6
        stack.push(3);//2   //5
        stack.push(4);//4   //4
        stack.push(5);//5   //3
        stack.push(6);//6   //2
        stack.push(7);//7   //1
        System.out.println("Search results "+stack.search(7));

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        stack.add(5);
        System.out.println(stack);
        System.out.println(stack.contains(Integer.valueOf(5)));
        System.out.println(stack.contains(2));

        //creating stack from LinkedList
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1); //push
        linkedList.addLast(2); //push
        linkedList.addLast(3); //push
        linkedList.getLast(); //peak
        linkedList.removeLast(); //pop
        linkedList.size();
        linkedList.isEmpty();



    }
}
