package main.java.chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:00
 */
public class Main {
  private static final String WELCOME_LINE = "Choose notation to show, default (d) or custom (c), or any other character to quit:";
  private static final String COMMAND_LINE_PARSE_ERROR = "Could not read character from command line";
  private static final String PRINT_CUSTOM_NOTATION_LINE = "Add (a) figure or print (p) notation for (%s) figures: ";
  private static final String ADD_FIGURE_LINE = "Type letter, digit, type e.g. \"a3Q\":";

  public static void main(String[] args) {
    welcome();
  }

  private static void welcome() {
    System.out.println(WELCOME_LINE);
    String command = getCommand();
    if (command.toLowerCase().equals("d")) {
      printDefaultNotation();
    } else if (command.toLowerCase().equals("c")) {
      printCustomNotation(null);
    }
  }

  private static String getCommand() {
    try {
      BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
      return bufferRead.readLine();
    } catch(IOException e) {
      System.out.println(COMMAND_LINE_PARSE_ERROR);
      return "q";
    }
  }

  private static void printDefaultNotation() {
    System.out.println(getNotation(getDefaultFigures()));
  }

  private static void printCustomNotation(List<ChessFigure> figures) {
    if (figures == null) {
      figures = new ArrayList<>();
    }
    System.out.println(String.format(PRINT_CUSTOM_NOTATION_LINE, figures.size()));
    String command = getCommand();
    if (command.toLowerCase().equals("a")) {
      System.out.println(ADD_FIGURE_LINE);
      addFigure(getCommand(), figures);
      printCustomNotation(figures);
    } else if (command.toLowerCase().equals("p")) {
      System.out.println(getNotation(figures));
    }
  }

  private static List<ChessFigure> getDefaultFigures() {
    List<ChessFigure> figures = new ArrayList<>();
    figures.add(new ChessFigure('a', '2', "Q"));
    figures.add(new ChessFigure('b', '4', "Q"));
    figures.add(new ChessFigure('c', '6', "Q"));
    figures.add(new ChessFigure('d', '8', "Q"));
    figures.add(new ChessFigure('e', '3', "Q"));
    figures.add(new ChessFigure('f', '1', "Q"));
    figures.add(new ChessFigure('g', '7', "Q"));
    figures.add(new ChessFigure('h', '5', "Q"));
    return figures;
  }

  private static String getNotation(List<ChessFigure> figures) {
    ChessBoard chessBoard = new ChessBoard(figures);
    ChessBoardNotation chessBoardNotation = new ChessBoardNotation(chessBoard);
    return chessBoardNotation.getNotation();
  }

  private static void addFigure(String figure, List<ChessFigure> addedFigures) {
    try {
      addedFigures.add(new ChessFigure(figure.charAt(0), figure.charAt(1), String.valueOf(figure.charAt(2))));
    } catch (Exception e) {
      welcome();
    }
  }
}
