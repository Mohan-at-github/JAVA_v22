package Decorator.Icecream_Design;

public class Strowberry_syrup extends Ingredient_Decorator{
    public Strowberry_syrup(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost()+30;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+", syrup";
    }
}
