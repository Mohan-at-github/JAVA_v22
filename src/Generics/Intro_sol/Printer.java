package Generics.Intro_sol;

public class Printer<T>{ //T->type
    T thingToPrint;
    //data type T is only variable
    //(not specifying which data type it is more generalized)

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void print()
    {
        System.out.println(thingToPrint);
    }

    public T get() {
        return thingToPrint;
    }

    public void set(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
}
