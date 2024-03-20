package Inheritance.final_Super_demo;

public class B extends A {

    public void print()
    {
       super.print();
        System.out.println("B");
    }
//    public void display() //final method cannot be overridden
//    {
//        System.out.println("b");
//    }
}
