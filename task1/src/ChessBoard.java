import java.util.ArrayList;
import java.util.List;

/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:31
 */
public class ChessBoard {
  private List<ChessFigure> figures;

  ChessBoard(List<ChessFigure> figures) {
    this.figures = new ArrayList<>();
    figures.forEach(this::arrangeFigure);
  }

  public void arrangeFigure(ChessFigure figure) {
    figures.add(figure);
  }

  public List<ChessFigure> getFigures() {
    return figures;
  }
}
