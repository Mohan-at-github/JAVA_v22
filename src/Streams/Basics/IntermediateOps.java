package Streams.Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mohan","Mohith","lohith","Kiran","Suhas","Vikas");
        //1.filter
        long m = list.stream().filter(x -> x.startsWith("M")).count();
        System.out.println(m);

        //2.map
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        //3.sorted
        //asc
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        //desc
        List<String> collect1 = list.stream().sorted((a, b) -> b.length() - a.length()).collect(Collectors.toList());
        System.out.println(collect1);

        //4.distinct()
        List<String> m1 = list.stream().filter(x -> x.startsWith("M")).distinct().collect(Collectors.toList());
        System.out.println(m1);

        //5.limit()
        List<Integer> collect2 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect2);

        //6.skip
        List<Integer> collect3 = Stream.iterate(1, x -> x + 1).limit(100).skip(10).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
