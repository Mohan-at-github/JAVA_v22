package Bridge;

public abstract class Ingredient_Decorator implements Ingredient {
    //this class can be extended by multiple classes developed based on add-ons to icecream
    //this is an abstract class so compiler is not forcing us to implement interface
    //purpose of this class is to introduce the baseIngredient and give it to add_on's
    Ingredient baseIngredient; //Ingredient_decorator having instance of decorator interface

    public Ingredient_Decorator(Ingredient baseIngredient){
    //with in the constructor we are passing the instance of decorator Interface

        this.baseIngredient = baseIngredient;
    }
}
