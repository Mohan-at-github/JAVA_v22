package Lambdas.Diff_way_Impl;

public interface noArgInterface {
    public void noarg();
   final static int x=10;
   default public void print()
   {
       System.out.println("hii I am default method");
   }
    public static void show()
    {
        System.out.println("hii I am static method and you can access me using className.myName");
    }

}
