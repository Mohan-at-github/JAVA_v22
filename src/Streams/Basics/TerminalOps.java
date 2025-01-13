package Streams.Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //7. toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        //8. min/max
        System.out.println("max "+Stream.of(4, 56, 3, 45).max(Comparator.naturalOrder()));
        System.out.println(STR."min \{Stream.of(4, 56, 3, 45).min(Comparator.naturalOrder())}");
        System.out.println("max "+Stream.of(4, 56, 3, 45).max((a1,b1)->b1-a1));

        //9. forEachOrder
        List<Integer> nums=Arrays.asList(2,6,4,3,7,9,5);
        System.out.println("print using for each");
        nums.parallelStream().forEach(System.out::print);
        System.out.println("print using for each order");
        nums.parallelStream().forEachOrdered(System.out::print);
    }
}
