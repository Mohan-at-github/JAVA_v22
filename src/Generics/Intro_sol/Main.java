package Generics.Intro_sol;

import Generics.Intro.DoublePrinter;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> ip=new Printer<>(10);
        Integer i= ip.get();
        ip.print();
        Printer<Double> dp=new Printer<>(10d);
        Double d=dp.get();
        // In object class we needed to do casting
        // but now no need to do anything because of generics.
        dp.print();
        //Printer<Double> dp1=new Printer<>("Mohan");
        //I am getting compile time error
        // Error: when we have mistakenly given string in the place of double
        //no instance(s) of type variable(s) exist so that String conforms to Double
        Pair<Integer,String> is=new Pair<>(10,"Mohan");
        Integer first = is.getFirst();
        String second = is.getSecond();
        Pair<Integer,Pair<Integer,String>> psi=new Pair<>(2,is);
        

    }
}
