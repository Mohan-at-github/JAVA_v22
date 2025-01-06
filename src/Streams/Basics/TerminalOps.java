package Streams.Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,6,7,-1);

        //Terminal operator: used to convert stream in to respective data type
        //1.collect() or tolist()
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //2.forEach()
        list.stream().forEach(System.out::println);

        //3.reduce() :combine the elements to produce single results
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger);

        //4.Count
        System.out.println(list.stream().count());

        //5. anyMatch, allMatch, noneMatch and this will return boolean
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean a = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(a);

        boolean c = list.stream().noneMatch(x -> x<0);
        System.out.println(c);

        //6. findFirst, findAny
        System.out.println(list.stream().findAny().get());
        System.out.println(list.stream().findFirst().get());
    }
}
