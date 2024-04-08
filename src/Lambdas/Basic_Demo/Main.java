package Lambdas.Basic_Demo;
//note: Lambda expression works only with functional interface
//because it will have only one abstract method,
// so no need to define method completely while using those methods in our concrete class.
public class Main {
    public static void main(String[] args) {
        //without using Lambda
        A a=new A(){ //anonymous inner class
            public void show()
            {
                System.out.println("I am in a");
            }
        };

        //using lambda (java is no more verbose from java 8 i.e, no need to define everything in detail
        //C is functional interface
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
   // public void print1(); no more than 1 abstract method in Functional interface
}