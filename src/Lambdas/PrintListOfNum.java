package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrintListOfNum {
    private static void printnum(int num){
        System.out.println(num);
    }
    private static boolean IsEven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(7);
        /*
        //traditional approach
        for(int num :list)
        {
            System.out.println(num);
        }
        */
     //using Functional programming

     // list.stream()
        // .forEach(PrintListOfNum::printnum);

        //better approach
        //for this we don't want a method
        list.stream().forEach(System.out::println);
        System.out.println();

    // print even numbers
        /*Traditional method
        for(int num:list){
            if(num%2==0){
                System.out.println(num);
            }
        }
        */

        //functional programming
        list.stream()
                .filter(PrintListOfNum::IsEven)
                .forEach(System.out::println);
        System.out.println();

        //better approach
        //using Lambda expression
        //IsEven method is not required
        list.stream()
                .filter(num -> num%2==0) //return type ->method_operation
                .forEach(System.out::println);
        System.out.println();

        //print odd number
        list.stream()
                .filter(num->num%2!=0)
                .forEach(System.out::println);
        System.out.println();

        //square of the even number
        System.out.println("square of the even number");
        list.stream()
                .filter(num->num%2==0)
                .map(num->num*num)
                .forEach(System.out::println);
        System.out.println();

        //cube of the odd number
        System.out.println("cube of the odd number");
        list.stream()
                .filter(num->num%2!=0)
                .map(num->num*num*num)
                .forEach(System.out::println);
        System.out.println();

        //sum of all numbers in the list
        System.out.println("sum of all numbers in the list");
    int sum=list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
