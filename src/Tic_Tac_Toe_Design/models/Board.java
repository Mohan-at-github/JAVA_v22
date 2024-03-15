package Tic_Tac_Toe_Design.models;
import java.util.ArrayList;
import java.util.List;
public class Board {
    private List<List<Cell>> cells; //A 2D array List
    //2D arrayList is a Dynamic list of lists
    //you can change the size of these lists during runtime
    public Board(int n) { //constructor
        this.cells = new ArrayList<>(); //cells-> [] acts has a matrix
        for(int i=0;i<n;i++)
        {
            //this.cells.add(new ArrayList<>(n));//if n=3,cells-> [ [_, _, _], [_, _, _], [_, _, _] ]
            //the above like will give empty 2D matrix, but we want matrix filled with Cell obj
            List<Cell> row=new ArrayList<>(); //this will create rows in my matrix
            for(int j=0;j<n;j++)
            {
                row.add(new Cell(i,j,Cellstatus.UNOCCUPIED)); //this will add objects for each row which is unoccupied initially
            }
            this.cells.add(row); //now row with cell obj is added to my matrix
        }
    }

    public List<List<Cell>> getCells() { //getter
        return cells;
    }

    public void setCells(List<List<Cell>> cells) { //setter
        this.cells = cells;
    }

    public void printBoard() {
        int n=cells.size();
        for(int i=0;i<n;i++)//row of the matrix
        {
            List<Cell> row=this.cells.get(i);
            for(int j=0;j<n;j++)//col of the matrix
            {
               Cell cell=row.get(j);
               cell.printCell();
            }
            System.out.println();
        }
    }
    public boolean checkIfCellIsunoccupied(int row,int col){
        Cell cell=this.cells.get(row).get(col);
        return cell.isUnoccupied();

    }
    public void setPlayer(int row,int col,Player player)
    {
        this.cells.get(row).get(col).setPlayer(player);
    }

    public Cell getCell(int row, int col) {
     return this.cells.get(row).get(col);

    }
    public int getSize()
    {
        return this.cells.size();
    }
}
