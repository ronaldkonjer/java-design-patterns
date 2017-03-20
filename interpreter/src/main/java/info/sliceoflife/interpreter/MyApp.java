package info.sliceoflife.interpreter;

import java.util.Stack;

/**
 * The Interpreter Pattern is a desing pattern that specifies how to evaluate sentences in a
 * language. The basic idea is to have a class for each symbol (terminal or nonterminal) in a
 * specialized computer language. The syntax tree of a sentence in the language is an instance
 * of the composite pattern and is used to evaluate (interpret) the sentence for a client.
 * <p>
 * In this example we use the Interpreter pattern to break sentences into expressions
 * ({@link MyExpression}) that can be evaluated and as a whole from the result.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * program entry point
   * <p>
   * Expressions can be evaluated using prefix, infix or postfix notations.
   * This sample uses postfix, where operator comes after the operands
   *
   * @param args command line args
   */

  public static void main(final String[] args) {
    final String tokenString = "4 3 2 - 1 + *";
    final Stack<MyExpression> stack = new Stack<>();

    final String[] tokenList = tokenString.split(" ");
    for (final String s : tokenList) {
      if (isOperator(s)) {
        final MyExpression rightExpression = stack.pop();
        final MyExpression leftExpression = stack.pop();
        System.out.println(String.format("popped from stack left: %d right: %d", leftExpression.interpret(),
            rightExpression.interpret()));
        final MyExpression operator = getOperatorInstance(s, leftExpression, rightExpression);
        System.out.println(String.format("operator: %s", operator));
        final int result = operator.interpret();
        final MyNumberExpression resultExpression = new MyNumberExpression(result);
        stack.push(resultExpression);
        System.out.println(String.format("push to stack: %d", resultExpression.interpret()));
      } else {
        final MyExpression i = new MyNumberExpression(s);
        stack.push(i);
        System.out.println(String.format("push to stack: %d", i.interpret()));
      }
    }
    System.out.println(String.format("result: %d", stack.pop().interpret()));

  }

  public static boolean isOperator(final String s) {
    return s.equals("+") || s.equals("-") || s.equals("*");
  }

  /**
   * Get expression for string
   */
  public static MyExpression getOperatorInstance(final String s, final MyExpression left, final MyExpression right) {
    switch (s) {
      case "+":
        return new MyPlusExpression(left, right);
      case "-":
        return new MyMinusExpression(left, right);
      case "*":
        return new MyMultiplyExpression(left, right);
      default:
        return new MyMultiplyExpression(left, right);
    }
  }
}
