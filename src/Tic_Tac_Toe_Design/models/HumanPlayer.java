package Tic_Tac_Toe_Design.models;

import javafx.util.Pair;

import java.util.*;


public class HumanPlayer extends Player {
    public HumanPlayer(String name, Symbol s) {
        //constructor chaining,first create obj of parent class then obj of child class
        // first player then human
        super(name, s);
        //here name and symbol are private in player class
        //becz we have super we will call parent constructor
        //then will set values for name and symbol in parent class

    }

    @Override
    public Pair<Integer, Integer> makeMove() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the row and column");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new Pair<>(row, col);
    }
}
