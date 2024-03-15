package Tic_Tac_Toe_Design;

import Inheritance.final_Super_demo.B;
import Tic_Tac_Toe_Design.Controller.GameController;
import Tic_Tac_Toe_Design.models.*;


import java.util.*;

public class TicTacToe {
    //this class will act as a client
    //this class will take to controller class to get its job done
    //most critical model we created today is game becz it have all the details to play Tic Tac Toe game

    public static void main(String[] args) {

        GameController gameController=new GameController(); //client class has to work with controller class so we need object
        Scanner src=new Scanner(System.in);
        System.out.println("How many human player?");
        int numOfHumanPlayers= src.nextInt();
        //to avoid clash between symbols for player we use Hashset
        Set<Character> symbolSet=new HashSet<>();
        List<Player> players=new ArrayList<>();
        for(int i=0;i<numOfHumanPlayers;i++)
        {

            System.out.println("Enter the name and symbol for player");
            String name=src.next();
            String symbolStr= src.next();
            char symbol=symbolStr.charAt(0);
            while(symbolSet.contains(symbol)) {
                System.out.println("Enter the new Symbol");
                symbolStr= src.next();
                symbol=symbolStr.charAt(0);
            }
            symbolSet.add(symbol);
            players.add(new HumanPlayer(name, new Symbol(symbol)));

        }
        System.out.println("How many bots?");
        int numOfBotPlayers=src.nextInt();
        String s="abcdefghijklmnopqrstuvwxyz1234567890";
        Random random=new Random();
        for(int i=0;i<numOfBotPlayers;i++)
        {
            System.out.println("enter bot level E/M/D");
            String diffLevel=src.next();
            BotLevel botLevel;
            switch (diffLevel.charAt(0))
            {
                case 'E' :
                    botLevel=BotLevel.EASY;
                    break;
                case 'M' :
                    botLevel=BotLevel.MEDIUM;
                    break;
                case 'D' :
                    botLevel=BotLevel.DIFFICULT;
                    break;
                default:
                    System.out.println("Invalid Input so choosing default easy level");
                    botLevel=BotLevel.EASY;
                    break;
            }
            int idx=random.nextInt(s.length());//index of character that I want to use
            char symbol=s.charAt(idx); //random character is assigned to symbol
            while(symbolSet.contains(symbol)){ //here symbols are clashing
                idx=random.nextInt(s.length());
                symbol=s.charAt(idx);
            }
            symbolSet.add(symbol);
            players.add(new BotPlayer("Bot " + (i+1), new Symbol(symbol), botLevel));
        }
        Game game;
        try{
            game=gameController.createGame(players);
        }
       catch(Exception e){
           System.out.println("Error while creating the game: "+e.getMessage());
           return;
       }
      //now my game object is ready
      //what i shld do to start the game
      // while game is in progress
      //1. print the board
      //2. make a move
      //2.1 check if player has won
      //2.1.1 If player wins, set the game status to ENDED
      //2.1.2 Else if Draw, set the game status to DRAW
      //2.1.3 Else, pass the chance to next player and capture the move

       while(gameController.getGameStatus(game)== GameStatus.IN_PROGRESS)
       {
           gameController.printBoard(game);
           gameController.makeMove(game);
       }
        GameStatus gameStatus = gameController.getGameStatus(game);
        if(gameStatus.equals(GameStatus.ENDED)){
            //thismeans someone has won
        }
        else {
            System.out.println("this game is Draw");
        }
    }
}
