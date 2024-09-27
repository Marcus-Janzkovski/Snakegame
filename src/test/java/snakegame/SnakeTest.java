package snakegame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SnakeTest {
    @Test
    public void testGrow(){
        Cell inipos = new Cell(0, 0);
        Snake snake = new Snake(inipos);      

        snake.grow();

        assertEquals(snake.getBodySnake().size(), 2);
    }

    @Test

    public void testCrash(){
        Cell inipos = new Cell(0, 0);

        Cell nexCell = new Cell(0,0);
        Snake snake = new Snake(inipos);      

        

        assertEquals(snake.checkCrash(nexCell), true);
    }


}
