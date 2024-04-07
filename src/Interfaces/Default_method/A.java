package Interfaces.Default_method;

public interface A {
    public default void print(){
        System.out.println("Hii I am default method of A");
    }
    public default void write()
    {
        System.out.println("hii ");
    }
}
