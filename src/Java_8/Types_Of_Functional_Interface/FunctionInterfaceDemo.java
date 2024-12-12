package Java_8.Types_Of_Functional_Interface;

import java.util.function.*;

public class FunctionInterfaceDemo  {
    public static void main(String[] args) {
        Consumer<String> consumer=(String str)-> System.out.println("Hii single Input is consumed");
        consumer.accept("mohan");

        Predicate<Integer> predicate=(Integer x) -> x > 10;
        System.out.println("Predicate: "+predicate.test(20));

        Function<Integer,Integer> fun=(Integer x) -> x+5;
        System.out.println("Single Input Function: "+fun.apply(10));

        Supplier<Integer> integerSupplier=() -> 10;
        System.out.println("Supplier: "+integerSupplier.get());

        BiFunction<Integer,Integer,Integer> sumfunction= (Integer x, Integer y)-> x+y;
        System.out.println("double Input Function: "+sumfunction.apply(10,20));

        BiPredicate<String , String> compareString=(String s1, String s2) -> s1.equals(s2);
        System.out.println("double input Predicate: "+compareString.test("mohan", "mohan"));

        BiConsumer<String,String> acceptString=(String s1, String s2) -> System.out.println("consumed both string");
        acceptString.accept("mohan", "Raju");


    }


}

