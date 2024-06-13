package Exceptions.Try_catch_Demo;

public class Main {
    public static void main(String[] args) {
        Dog dog=null;
        //System.out.println(dog.getName());
        // Exception in thread "main" java.lang.NullPointerException
        try{
            System.out.println(dog.getName());
        }
        catch (NullPointerException e)
        {
//            dog=new Dog();
//            System.out.println(dog.getName());
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hii i am here for closing up if any" +
                    " file is opened and also unlocking threads which are locked during try catch");
        }

    }
}
