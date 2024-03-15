package Decorator.Pizza_Design;

public class Main {
    public static void main(String[] args) {
        Pizza paneerpizza=new PaneerChessDecorator(new basePizza());
        Pizza chesspizza=new ChessburstDecorator(new basePizza());
        System.out.println(paneerpizza.bake());
        System.out.println(chesspizza.bake());
    }
}
