package Decorator.Pizza_Design;

public class PaneerChessDecorator extends PizzaDecorator{

    public PaneerChessDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake()+ " it is a Corn Chess Pizza";
    }
}
