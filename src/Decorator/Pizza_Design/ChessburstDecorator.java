package Decorator.Pizza_Design;

public class ChessburstDecorator extends PizzaDecorator{
    public ChessburstDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake()+" it is a ChessBurst Pizza";
    }
}
