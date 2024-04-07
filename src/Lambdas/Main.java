package Lambdas;

public class Main {
    public static void main(String[] args) {
        A a=new A(){ //anonymous class it's a inner class
            public void show()
            {
                System.out.println("I am in a");
            }
        };

        C cLambda=() -> System.out.println("Hii I am a lambda");
        a.show();
        cLambda.print();
    }
}

class A{
    public void show(){
        System.out.println("I am in A");
    }
}

@FunctionalInterface
interface C{
    public abstract void print();
    public default void demo(){

    }

    public static void demo1() {

    }
   // public void print1(); no more than 1 abstract class
}