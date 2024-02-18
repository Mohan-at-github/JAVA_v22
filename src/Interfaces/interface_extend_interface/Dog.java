package Interfaces.interface_extend_interface;

class dog implements object{

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void fly() {

    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void attacking() {
        System.out.println("Dog is attacking");
    }
}
