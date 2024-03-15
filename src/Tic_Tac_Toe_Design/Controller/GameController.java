package Tic_Tac_Toe_Design.Controller;
import java.util.*;

import Tic_Tac_Toe_Design.Exceptions.BotCountExceededException;
import Tic_Tac_Toe_Design.models.Game;
import Tic_Tac_Toe_Design.models.GameStatus;
import Tic_Tac_Toe_Design.models.Player;

public class GameController {
    public Game createGame(List<Player> players) throws BotCountExceededException
    {
        return Game.getBuilder()
                .setPlayer(players)
                .build();
    }

    public GameStatus getGameStatus(Game game){
         return game.getGameStatus();
    }

    public void printBoard(Game game)
    {
        game.printBoard();
    }
    public void makeMove(Game game)
    {

    }
}
