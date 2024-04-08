package Anonymous_Inner_Class.with_Abstract;

public class main {
    public static void main(String[] args) {
        //B obj=new B();//we cannot create an object of abstract class
        B obj=new B(){ // we are creating an object of anonymous class not abstract class B
            public void show() //abstract method
            {
                System.out.println("I am a new show");
            }
            public void config(){ //abstract method
                System.out.println("I am config");
            }

            public void text(){ //concrete method
                System.out.println("Good night");
            }
        };
        obj.show();
        obj.print(); //concrete method from class A (not overrided)
        obj.config();
        obj.text();
    }
}
