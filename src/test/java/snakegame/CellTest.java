package snakegame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class CellTest {

    @Test
    public void testInicialization(){
        Cell cell1 = new Cell(0, 0);
        Cell cell2 = new Cell(0,1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void testSetTypeEmpty(){

        Cell cell1 = new Cell(0, 0);
        cell1.setCelltype(Celltype.EMPTY);

        assertEquals(cell1.getCelltype(), Celltype.EMPTY);
    }

    @Test
    public void testSetTypeFood(){

        Cell cell1 = new Cell(0, 0);
        cell1.setCelltype(Celltype.FOOD);

        assertEquals(cell1.getCelltype(), Celltype.FOOD);
    }

    @Test
    public void testSetTypeSnake(){

        Cell cell1 = new Cell(0, 0);
        cell1.setCelltype(Celltype.SNAKE_NODE);

        assertEquals(cell1.getCelltype(), Celltype.SNAKE_NODE);
    }


}
