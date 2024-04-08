package Inner_Classes.Static;

import Inner_Classes.Non_Static.A;

public class Main {
    public static void main(String[] args) {
        //a obj=new a(); cont not create an object of abstract class
        a.b obj1= new a.b();//B is s static class we don't need any object of outer class(A) to access that class
        obj1.print();
    }
}
