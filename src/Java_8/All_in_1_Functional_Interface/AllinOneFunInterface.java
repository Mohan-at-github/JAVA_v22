package Java_8.All_in_1_Functional_Interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllinOneFunInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicate=x->x%2==0;
        Function<Integer,Integer> function=x->x*2;
        Consumer<Integer> consumer= System.out::println;
        Supplier<Integer> supplier=()->100;

       if(predicate.test(supplier.get())){
           consumer.accept(function.apply(supplier.get()));
        }
    }
}
