package Bridge;

public class Mango_Cone implements Ingredient {
    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Mango Cone";
    }
}
