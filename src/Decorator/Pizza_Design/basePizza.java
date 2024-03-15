package Decorator.Pizza_Design;

public class basePizza implements Pizza{

    @Override
    public String bake() {
        return "pizza Base is crysp and";
    }
}
