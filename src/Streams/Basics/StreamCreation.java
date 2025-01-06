package Streams.Basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //different ways of creating stream
        //1.from List
        List<Integer> list= Arrays.asList(1,3,55,66,76,4,5,2,1);
        Stream<Integer> stream = list.stream();

        //2.from Array
        String[] strArray={"mohan","lohith","Kiran","Suhas","Vikas"};
        Stream<String> stream1=Arrays.stream(strArray);

        //3. using Stream.of()
        Stream<Integer> integerStream=Stream.of(1,8,9,90,78,65,3,1);

        //4. using iterator
        //infinite stream: generate and iterate
        Stream<Integer> generate= Stream.generate(()->1);
        Stream<Integer> integerStream1=Stream.iterate(1, x->x+1);


    }
}
