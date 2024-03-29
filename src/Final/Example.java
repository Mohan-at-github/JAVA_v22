package Final;

public class Example {
    public static final double PI = 3.14; //final variable and local variable.
    //mostly we use final, to create a constant which is static and final.
    public static void main(String[] args) {
        final String s = "Hi!";
        System.out.println(s);
//        s = "Hello"; //Cannot assign a value to final variable 's'
        final String abc;
        abc = "Hello!";
        // abc = "Bye!";
//        PI = 2.56;
        System.out.println(PI);
    }
}

//final method
final class A{
    public final void print(){
        System.out.println("I cannot be overridden");
    }
}

//class B extends A
//{ Cannot inherit from final 'final_demo.A'
// public void print(){ //'print()' cannot override 'print()' in 'final_demo.A'; overridden method is final
//
//    }
//}

class C{
    final int abc;//instance variable
    final int xyz = 10;
    public C(){
        abc = 3;
    }

    public C(int abc){
        this.abc = abc;
        //this.xyz=100; Cannot assign a value to final variable 'xyz'
    }

    public void doSomething(){
//         abc = 10; //Cannot assign a value to final variable 'abc'
        double x=Example.PI; //consuming static variable by classname.variableName
    }
}

