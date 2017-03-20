package info.sliceoflife.interpreter;

import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyPlusExpressionTest extends MyExpressionTest<MyPlusExpression> {

  /**
   * Create a new set of test entries with the expected result
   *
   * @return The list of parameters used during this test
   */
  @Parameters
  public static List<Object[]> data() {
    return prepareParameters((f, s) -> f + s);
  }

  /**
   * Create a new test instance using the given test parameters and expected result
   *
   * @param first The first expression parameter
   * @param second The second expression parameter
   * @param result The expected result
   */
  public MyPlusExpressionTest(final MyNumberExpression first, final MyNumberExpression second, final int result) {
    super(first, second, result, "+", MyPlusExpression::new);
  }

}
