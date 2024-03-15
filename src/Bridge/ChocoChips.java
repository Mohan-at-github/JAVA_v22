package Bridge;

public class ChocoChips extends Ingredient_Decorator {
    public ChocoChips(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost()+30;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+", Choco chips";
    }
}
