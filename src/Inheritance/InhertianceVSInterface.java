package Inheritance;

import java.lang.classfile.Interfaces;

public class InhertianceVSInterface {
    class A{
        public void a(){
            System.out.println("hii I am A");
        }
    }

    class B{
        public void a(){
            System.out.println("hii I am B");
        }
    }

//    class C extends A,B{
//        public void a(){
//        error: Class cannot extend multiple classes
//        because A and B have same concrete method so compiler will get confused for choosing which method
//        }
//    }
   public interface AA{
    public void a();
}
    interface BB{
        public void a();
    }
    class ABC extends A implements AA,BB{

        @Override
        public void a() {
            System.out.println("now I can do multiple inheritance using interfaces");
        }
    }
}
