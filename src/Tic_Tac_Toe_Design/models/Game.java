package Tic_Tac_Toe_Design.models;
import Tic_Tac_Toe_Design.Exceptions.BotCountExceededException;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
public class Game {
    private Board board;
    //private int numofPlayers;
    //private int numofBots;
    private List<Player> players;
    private GameStatus gameStatus;
    private int currentPlayerIdx;
    private List<Move> moves;
    //here we have lots of attributes so creating a constructor is not a good approach
    //so we use builder design pattern to have better approach


    private Game(Board board, List<Player> players, GameStatus gameStatus, int currentPlayerIdx, List<Move> moves) {
        //constructor is private because nobody else can create the object
        this.board = board;
        this.players = players;
        this.gameStatus = gameStatus;
        this.currentPlayerIdx = currentPlayerIdx;
        this.moves = moves;
    }

    //before creating setters we shld create a static method called as getBuilder()
    //game.getBuilder which returns the Gamebuilder object on that we will call setter
    public static GameBuilder getBuilder()
    {
        return new GameBuilder();
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public List<Move> getMoves() {
        return moves;
    }
    public void printBoard()
    {
        this.board.printBoard();
    }
    public void makeMove(){
       Player player=this.players.get(currentPlayerIdx); //it gives current player turn
       Pair<Integer, Integer> rowcol= player.makeMove();//give row and col of the cell
        while(!this.board.checkIfCellIsunoccupied(rowcol.getKey(),rowcol.getValue())){
            if(player instanceof HumanPlayer)
            {
                System.out.println("Please make a move on a different cell");
            }
            rowcol= player.makeMove();
        }
        this.board.setPlayer(rowcol.getKey(),rowcol.getValue(),player);
        Cell cell=this.board.getCell(rowcol.getKey(),rowcol.getValue());
        Move move=new Move(player,cell);
        this.moves.add(move);//we have captured the move in moves list
        if(checkForWin()){
            this.gameStatus=GameStatus.ENDED;
            return;
        }
        else if(checkForDraw()){
            this.gameStatus=GameStatus.DRAWN;
            return;//if I don't return I will execute the other logic too

        }
        this.currentPlayerIdx=(this.currentPlayerIdx+1)%(this.board.getSize()-1);
    }
    private boolean checkForWin()
    {
        return false;
    }
    private boolean checkForDraw(){
        int n=this.board.getSize();
        return n*n==this.moves.size();
    }

    public  static class GameBuilder{
        private Board board;
        //if no of player=n then board size=n+1 eg: n=2 then size of board =3 (dimension 3*3)
        private List<Player> players;
        //using this list we can find size of list which tell no of player and size of board
        //so we can avoid
        //private int numofPlayers;//no limit
        //private int numofBots;//at max no of bots=1 and min=0.
        private GameStatus gameStatus;
        private int currentPlayerIdx;
        private List<Move> moves;
       public GameBuilder setPlayer(List<Player> players)
       {
           this.players=players;
           int n=players.size();
           this.board=new Board(n+1);//my board is ready when we have no of players
           return this;
       }
       //A method present inside builder class which is called to return object for my original class(game)
       //In this method we can also perform validations as well
       public Game build() throws BotCountExceededException {
           int botCount=0;
           for(Player p:players)
           {
               if(p instanceof BotPlayer)
               {
                   botCount++;
               }
               if(botCount > 1)
               {
                   throw new BotCountExceededException("Found more that 1 Bot maximum 1 Bot per game");
               }
           }
         return new Game(this.board, this.players,GameStatus.IN_PROGRESS,0,new ArrayList<>());
       }
    }
}
