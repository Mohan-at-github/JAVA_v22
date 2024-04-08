package Inner_Classes.Non_Static;

public class Main {
    public static void main(String[] args) {
        A obj=new A();
        obj.print();
        A.B obj1=obj.new B();
        obj1.print();
    }
}
//if our inner class in non-static, then we need an object of its outer class to access that class