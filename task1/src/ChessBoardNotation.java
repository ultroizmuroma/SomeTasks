/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:14
 */
public class ChessBoardNotation {
  private ChessBoard chessBoard;
  private static final String NOTATION_SEPARATOR = ",";

  ChessBoardNotation(ChessBoard chessBoard) {
    this.chessBoard = chessBoard;
  }

  public String getNotation() {
    StringBuilder result = new StringBuilder();
    for (ChessFigure figure : chessBoard.getFigures()) {
      if (result.length() != 0) {
        result.append(NOTATION_SEPARATOR);
      }
      result.append(figure.getLetter());
      result.append(figure.getDigit());
    }
    return result.toString();
  }
}
