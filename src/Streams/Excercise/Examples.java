package Streams.Excercise;

import Streams.Basics.IntermediateOps;

import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
    //1. return the string who length is greater than 3
        List<String> name= Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(name.stream().filter(x->x.length()>3).toList());

    //2. Squaring and sorting number
       List<Integer> num=Arrays.asList(1,4,2,6,3,9,6,10,5);
        System.out.println(num.stream().map(x->x*x).sorted().toList());

    //3. Summing values
        System.out.println(num.stream().reduce((x,y)->x+y).get());
        //or
        System.out.println(num.stream().reduce(Integer::sum).get());

    //4. counting the occurrences of a character
        String sent="Hello World";
        char[] charArray = sent.toCharArray();
        //there is no method in stream which takes characters  so we use
        sent.chars(); //it converts String in to character specific integer values ie, ASCII values
        long count = sent.chars().filter(x -> x == 'l').count();
        System.out.println(count);

    }
}
