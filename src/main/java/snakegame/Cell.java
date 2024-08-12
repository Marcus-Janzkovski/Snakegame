package snakegame;

public class Cell {

    private final int row, col; //final serve para garantir que os valores não mudam após definição da classe
    private Celltype celltype; //tipo da celula: comida, vazio, cobra


    public Cell(int row,int col){ // Construtor da classe
        this.row = row;
        this.col = col;
    }

 //get e set genericos

    public Celltype getCelltype() {
        return this.celltype;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCelltype(Celltype celltype) {
        this.celltype = celltype;
    }


}
