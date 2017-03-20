package info.sliceoflife.interpreter;

/**
 * MinusExpression
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyMinusExpression extends MyExpression {

  private final MyExpression leftExpression;
  private final MyExpression rightExpression;

  public MyMinusExpression(final MyExpression leftExpression, final MyExpression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() - rightExpression.interpret();
  }

  @Override
  public String toString() {
    return "-";
  }

}
