package Tic_Tac_Toe_Design.models;

import javafx.util.Pair;

public class BotPlayer extends Player{
private BotLevel botLevel;
    public BotPlayer(String name, Symbol s,BotLevel level) {
        super(name, s); //calling player (parent) class constructor with two parameter
        this.botLevel=level;//we get bot level from enum class

    }

    @Override
    public Pair<Integer, Integer> makeMove() {

        return null;
    }
}
