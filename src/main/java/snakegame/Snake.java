package snakegame;
import java.util.LinkedList;

public class Snake {

    private LinkedList<Cell> bodySnake = new LinkedList<>();
    
    private Cell head;

    public Snake(Cell initPos){

        head = initPos;
        this.bodySnake.add(head);
        this.head.setCelltype(Celltype.SNAKE_NODE);

    }

    public void grow(){

        bodySnake.add(head);
    }

    public void move (Cell nextCell){

        System.out.println("Snake is moving to" + " " + nextCell.getRow() + " " + nextCell.getCol());

        Cell tail = bodySnake.removeLast();

        tail.setCelltype(Celltype.EMPTY);

        head = nextCell;
        head.setCelltype(Celltype.SNAKE_NODE);
        bodySnake.addFirst(head);
    }

    public boolean checkCrash(Cell nextCell){

        System.out.println("checking crash");
        
        for (Cell cell : this.bodySnake){
            if (cell == nextCell){ // Se a proxima celula estiver a lista encadeada, haverá colisão
                System.out.println("crash");
                return true;
            }
        }
    
        return false;
    }


//Get e Set generico

    public LinkedList<Cell> getBodySnake() {
        return bodySnake;
    }

    public Cell getHead() {
        return head;
    }

    public void setBodySnake(LinkedList<Cell> bodySnake) {
        this.bodySnake = bodySnake;
    }

    public void setHead(Cell head) {
        this.head = head;
    }

    


}
