package Java_8.Bi_Demos;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Bi_Demos {
    public static void main(String[] args) {
        //BiPredicate
        BiPredicate<Integer,Integer> biPredicate=(x,y)->x%2==0 && y%2==0;
        System.out.println(biPredicate.test(2, 4));

        //BiFunction
        BiFunction<String,String,Integer> biFunction=(x,y)->x.length()+y.length();
        System.out.println(biFunction.apply("hii", "Hello"));

        //BiConsumer
        BiConsumer<Integer,Integer> biConsumer=(x,y)-> System.out.println(x+y);
        biConsumer.accept(5, 6);

        //BiSupplier
        //it is not present because methods will always return single value only
    }
}
