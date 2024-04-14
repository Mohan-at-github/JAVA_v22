package Static.VariableDemo;

public class A {
    int x=10; //non-static variable
    static int y=10; //non-static variable

    public static void main(String[] args) {
        A obj1=new A();
        System.out.println(obj1.x);//20
        obj1.x=25;
        System.out.println(obj1.x);//25
        A obj2=new A();
        System.out.println(obj2.x);//20

        System.out.println(y);//10
        y=20;
        System.out.println(y);//20
    }
}
//each object can have different value for a non-static variable and initialized when obj is created
//static variable are common, and they will get initialized during code execution