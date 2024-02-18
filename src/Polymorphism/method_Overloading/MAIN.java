package Polymorphism.method_Overloading;

public class MAIN {
    public static class MAINS{
        public MAINS()
        {
            System.out.println("method over loading with out any parameter");
        }
        public MAINS(int x,int y)
        {
            System.out.println("method over loading with parameter and diff signature");
        }
        public MAINS(String z,int y)
        {
            System.out.println("method over loading with parameter and diff signature");
        }
    }

    public static void main(String[] args) {
        MAINS obj;
        obj=new MAINS();
        obj=new MAINS(10,20);
        obj=new MAINS("MOH",10);
    }
}
