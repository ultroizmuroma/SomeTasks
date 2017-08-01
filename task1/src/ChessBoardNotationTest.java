import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:15
 */
public class ChessBoardNotationTest {
  private ChessBoardNotation chessBoardNotation;

  @Before
  public void init() {
    List<ChessFigure> chessFigures = new ArrayList<>();
    chessFigures.add(new ChessFigure('a', '2', "Q"));
    chessFigures.add(new ChessFigure('b', '4', "Q"));
    chessFigures.add(new ChessFigure('c', '6', "Q"));
    chessFigures.add(new ChessFigure('d', '8', "Q"));
    chessFigures.add(new ChessFigure('e', '3', "Q"));
    chessFigures.add(new ChessFigure('f', '1', "Q"));
    chessFigures.add(new ChessFigure('g', '7', "Q"));
    chessFigures.add(new ChessFigure('h', '5', "Q"));

    ChessBoard chessBoard = new ChessBoard(chessFigures);

    chessBoardNotation = new ChessBoardNotation(chessBoard);
  }

  @After
  public void tearDown() { chessBoardNotation = null; }

  @Test
  public void calls() {
    assertEquals("a2,b4,c6,d8,e3,f1,g7,h5", chessBoardNotation.getNotation());
  }
}
