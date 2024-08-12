package snakegame;

public class Board {

    final int ROW_COUNT, COL_COUNT;

    private Cell[][] cells;

    public Board(int row, int col){
        this.ROW_COUNT = row;
        this.COL_COUNT = col;

        cells = new Cell[this.ROW_COUNT][this.COL_COUNT]; //cria matriz

        for (int lin = 0; lin < ROW_COUNT; lin++ ){ // inicializar cada celula
            for (int bar = 0; bar < COL_COUNT; bar++){

                cells[lin][bar] = new Cell(lin,bar);

            }

        }

    }

    public void generateFood(){

        System.out.println("generate food");
        
        int lin = 0;
        int bar = 0;

        while (true) {
            
            lin = (int)(Math.random() * ROW_COUNT);
            bar = (int)(Math.random() * COL_COUNT);

            if (cells[lin][bar].getCelltype() != Celltype.SNAKE_NODE){
                break;
            }
                
        }

        cells[lin][bar].setCelltype(Celltype.FOOD);

        System.out.println("Food generated at " + lin + " " + bar);

    }

    //get e set generico
    public int getROW_COUNT() {
        return ROW_COUNT;
    }

    public int getCOL_COUNT() {
        return COL_COUNT;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }



}
