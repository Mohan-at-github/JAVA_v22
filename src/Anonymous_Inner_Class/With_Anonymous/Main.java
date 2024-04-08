package Anonymous_Inner_Class.With_Anonymous;

public class Main {
    public static void main(String[] args) {
        a obj=new a(){
            public void shows(){
                System.out.println("Hii I reduced two class to one ");
            }
        };
        obj.shows();
    }
}
//Instead of creating a separate class B to override A, we used
//Anonymous class won't have any name
