package Interfaces.class_imp_interface;

public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
