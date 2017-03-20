package info.sliceoflife.interpreter;

/**
 * PlusExpression
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyPlusExpression extends MyExpression {

  private final MyExpression leftExpression;
  private final MyExpression rightExpression;

  public MyPlusExpression(final MyExpression leftExpression, final MyExpression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }

  @Override
  public String toString() {
    return "+";
  }

}
