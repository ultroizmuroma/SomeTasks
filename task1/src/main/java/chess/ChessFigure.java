package main.java.chess;

/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:40
 */
public class ChessFigure {
  private char letter;
  private char digit;
  private String type;

  public ChessFigure(char letter, char digit, String type) {
    this.letter = letter;
    this.digit = digit;
    this.type = type;
  }

  public char getLetter() {
    return letter;
  }

  public char getDigit() {
    return digit;
  }

  public String getType() {
    return type;
  }

  public void setLetter(char letter) {
    this.letter = letter;
  }

  public void setDigit(char digit) {
    this.digit = digit;
  }

  public void setType(String type) {
    this.type = type;
  }
}
