package info.sliceoflife.interpreter;

/**
 * NumberExpression
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyNumberExpression extends MyExpression {

  private final int number;

  public MyNumberExpression(final int number) {
    this.number = number;
  }

  public MyNumberExpression(final String s) {
    number = Integer.parseInt(s);
  }

  @Override
  public int interpret() {
    return number;
  }

  @Override
  public String toString() {
    return "number";
  }

}
