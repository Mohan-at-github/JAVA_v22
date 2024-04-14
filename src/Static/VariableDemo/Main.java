package Static.VariableDemo;

public class Main {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.x); //to access non-static variable, we need an object of that class, its an instance(obj) specific
        System.out.println(A.y); //to access static variable, we just need class name . variable name if you are in different class
        //if you are in same class just name of the variable
    }
}
