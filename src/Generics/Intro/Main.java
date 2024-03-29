package Generics.Intro;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter=new IntegerPrinter(10);
        integerPrinter.print();
        DoublePrinter doublePrinter=new DoublePrinter(10d);
        doublePrinter.print();
        // if we want more like String, float etc we can keep on creating class but this will lead to class explosion.

        ObjectToPrint obj1=new ObjectToPrint(10);
        Integer i= (Integer) obj1.getObjectToPrint();

        ObjectToPrint obj2=new ObjectToPrint(10d);
        Double d=(Double) obj2.getObjectToPrint();

        ObjectToPrint obj3=new ObjectToPrint("Mohan");
        Integer i1=(Integer) obj3.getObjectToPrint(); // there will be error because we are putting string
        // and trying to get Integer and compiler is not giving error also.
        //error while running
        //Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot
        // be cast to class java.lang.Integer
        //solution to this is generics <>.
    }
}
