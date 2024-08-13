package snakegame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void testBoardInitialization10e20() {
        Board board = new Board(10, 20);
        assertEquals(10, board.getROW_COUNT(), "A largura do tabuleiro deve ser 10");
        assertEquals(20, board.getCOL_COUNT(), "A altura do tabuleiro deve ser 20");
        System.out.println("Inicialização 10 e 20 testada");
    }

    @Test
    public void testBoardInitialization0e0() {
        Board board = new Board(0, 0);
        assertEquals(0, board.getROW_COUNT(), "A largura do tabuleiro deve ser 10");
        assertEquals(0, board.getCOL_COUNT(), "A altura do tabuleiro deve ser 20");
        System.out.println("Inicialização 0 e 0 testada");
    }

    @Test
    public void testGenerateFood(){

        Board board = new Board(10, 10);
        board.generateFood();
        
        boolean havefood = false;
        

        for (int lin = 0; lin < board.ROW_COUNT; lin++){
            for (int bar = 0; bar < board.COL_COUNT; bar++){
                if(board.getCells()[lin][bar].getCelltype() == Celltype.FOOD ){
                    havefood = true;
                }
            }
        }

        assertEquals(havefood,true);
        
        board.generateBoardPrint();
        System.out.println("Generate food testado");
    }  
         
    @Test
    public void testPrintBoard() {
        Board board = new Board(5, 5);
        String output = "OOOOO\nOOOOO\nOOOOO\nOOOOO\nOOOOO\n";
        assertEquals(output,board.generateBoardPrint());
    }



}
