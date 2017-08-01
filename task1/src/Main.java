import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * @author alexey.barinov
 * @version 1.0
 *          Date: 01.08.2017
 *          Time: 17:00
 */
public class Main {

  public static void main(String[] args) {
    JUnitCore runner = new JUnitCore();
    Result result = runner.run(ChessBoardNotationTest.class);
    System.out.println("run tests: " + result.getRunCount());
    System.out.println("failed tests: " + result.getFailureCount());
    System.out.println("ignored tests: " + result.getIgnoreCount());
    System.out.println("success: " + result.wasSuccessful());
  }
}
