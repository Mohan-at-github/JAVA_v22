package Static.Block;

public class A {
    static int x=5;
    static int y;
    int z;
    static{
        y=x+10;
        //z=x+200; Non-static field 'z' cannot be referenced from a static context
    }
}
