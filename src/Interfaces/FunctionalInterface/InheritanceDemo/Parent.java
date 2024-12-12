package Interfaces.FunctionalInterface.InheritanceDemo;
@FunctionalInterface
public interface Parent {
    public void sayHello();
    public default void sayBye(){
        System.out.println("A's bye");
    }
        public static void add(){
            System.out.println("Adding");
        }

}
