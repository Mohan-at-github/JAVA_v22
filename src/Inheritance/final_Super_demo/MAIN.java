package Inheritance.final_Super_demo;

public class MAIN {
    static final int x=10;
    public static void main(String[] args) {
        B obj1=new B();
        obj1.print();
        obj1.display();
//        x=20;//Cannot assign a value to final variable 'x'
       System.out.println(x);
    }
}
