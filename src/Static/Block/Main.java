package Static.Block;

public class Main {
    public static void main(String[] args) {
        System.out.println(A.x);
        System.out.println(A.y);
        //System.out.println(A.z); Non-static field 'z' cannot be referenced from a static context
        A obj=new A();
        System.out.println(obj.z);
        System.out.println(obj.x);//the value of x is common for all objects of A
        System.out.println(obj.y);//the value of Y is common for all objects of A
    }
}
