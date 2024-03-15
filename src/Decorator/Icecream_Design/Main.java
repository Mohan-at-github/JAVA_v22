package Decorator.Icecream_Design;

public class Main {
    public static void main(String[] args) {
        Ingredient iceream=new Strowberry_syrup( new ChocoChips(new Mango_scoop( new Choco_Cone())));
        System.out.println(iceream.getCost());
        System.out.println(iceream.getDescription());
    }
}
