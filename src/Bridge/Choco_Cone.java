package Bridge;

public class Choco_Cone implements Ingredient { //base(base class) for Cone Icecream
    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "choco Cone";
    }
}
