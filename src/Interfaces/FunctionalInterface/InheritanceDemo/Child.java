package Interfaces.FunctionalInterface.InheritanceDemo;
@FunctionalInterface
public interface Child extends Parent{
  public void sayHello();
  public default void sayBye() {
      System.out.println("B's Bye");
  }
  public static void add(){
      System.out.println("Adding");
  }
}
