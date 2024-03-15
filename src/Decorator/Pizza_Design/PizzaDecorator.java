package Decorator.Pizza_Design;

public abstract class PizzaDecorator implements Pizza {
   Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
