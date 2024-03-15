package Decorator.Icecream_Design;

public class Mango_scoop extends Ingredient_Decorator{
    public Mango_scoop(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost()+20;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+", manago scoop";
    }
}
