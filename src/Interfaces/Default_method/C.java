package Interfaces.Default_method;

public class C implements A,B{
    public static void main(String[] args) {

    }
    @Override
    public void print() {
        B.super.print(); //to resolve diamond problem because both A and B have same default method print.
        A.super.print();
        System.out.println("I am in C's method");
    }
}
