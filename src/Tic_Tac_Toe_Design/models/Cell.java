package Tic_Tac_Toe_Design.models;

public class Cell {
    private int row;
    private int col;
    private Cellstatus cellstatus;
    private Player player;


    public Cell(int row, int col, Cellstatus cellstatus) {
        this.row = row;
        this.col = col;
        this.cellstatus = cellstatus;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Cellstatus getCellstatus() {
        return cellstatus;
    }

    public void setCellstatus(Cellstatus cellstatus) {
        this.cellstatus = cellstatus;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player){
        this.player=player;
        this.cellstatus=Cellstatus.OCCUPIED;
    }
    public boolean isUnoccupied()
    {
        if(this.player == null && cellstatus.equals(Cellstatus.UNOCCUPIED)) {
            return true;
        }
            return false;
    }

    public void printCell()
    {
        if(cellstatus.equals(Cellstatus.UNOCCUPIED)) //cell unoccupied
        {
            System.out.print("_");
        }else //cell is occupied
        {
            System.out.print(" " +this.player.getSymbol().getSymbol()+" ");
        }
    }
}
