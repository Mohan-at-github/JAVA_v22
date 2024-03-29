package Wrapper_classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x=10;
        Integer obj1=x; //auto boxing -> primitive to wrapper

        Integer obj2=20;
        int y=obj2; //unboxing -> wrapper to primitive

        boolean b= false;
        Boolean obj=b; //auto boxing -> primitive to wrapper

        List<Integer> list = new ArrayList<>();
        //List<int> list1 =new List<int>();  not allow because primitive wont work with wrapper.
    }
}
