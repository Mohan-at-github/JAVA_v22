package Java_8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Client
{
    public static void main(String[] args) {
        //get
        Consumer<String> consume=x-> System.out.println(x);
        consume.accept("Mohan");

        Consumer<List<Integer>> listConsumer1=li->{
            for(Integer l:li){
                System.out.println(l+100);
            }
        };
        List<Integer> myList= Arrays.asList(2,4,5,6);
        listConsumer1.accept(myList);


       Consumer<List<Integer>> listconsumer2=x->{
          for(Integer l:x){
              System.out.println(l);
          }
        };
       listconsumer2.accept(Arrays.asList(2,4,5,6));
        System.out.println("andThen");
        //andthen
        Consumer<List<Integer>> listConsumer3=listconsumer2.andThen(listConsumer1);
        listConsumer3.accept(Arrays.asList(2,4,5,6));
    }
}
