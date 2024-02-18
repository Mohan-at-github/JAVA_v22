package Interfaces.class_imp_interface;

public class Main {
    public static void main(String[] args) {
         //Animal animal = new Animal(); //Animal' is abstract; cannot be instantiated
        Animal puppy=new Dog();
        puppy.walk();
        puppy.eat();
        puppy.sleep();
    }
}
