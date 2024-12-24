package Java_8.Unary_Binary_Operators;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Client {
    public static void main(String[] args) {
        //Unary Operator
        Function<Integer,Integer> function=x->x*x;
        System.out.println(function.apply(3));
        UnaryOperator<Integer> unaryOperator=x->x*x;
        System.out.println(function.apply(3));

        //Binary Operator
        BiFunction<String,String,String> biFunction= String::concat;
        System.out.println(biFunction.apply("mohan", "lohith"));
        BinaryOperator<String> binaryOperator=String::concat;
        System.out.println(binaryOperator.apply("mohan", "lohith"));
    }
}
