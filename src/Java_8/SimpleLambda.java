package Java_8;

public class SimpleLambda {
    public static void main(String[] args) {
        //before Java 8
        I obj=new I(){
            public void m(){
                System.out.println("Before Java 8");
            }
        };
        obj.m();

        //after java 8 and using lambda Expression
        I obj1=() -> {
            System.out.println("Using Java 8");
        };

        I obj2=() -> System.out.println("Using Java 8 in simpler way");
        obj1.m();
        obj2.m();
    }
}
