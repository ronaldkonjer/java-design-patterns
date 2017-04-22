package info.sliceoflife.strategy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.strategy.strategy.MyDragonSlayingStrategy;
import info.sliceoflife.strategy.strategy.impl.MyMeleeStrategy;
import info.sliceoflife.strategy.strategy.impl.MyProjectileStrategy;
import info.sliceoflife.strategy.strategy.impl.MySpellStrategy;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * MyDragonSlayingStrategy Test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyDragonSlayingStrategyTest {

  /**
   * @return The test parameters for each cycle
   */
  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[] {
            new MyMeleeStrategy(),
            "With your Excalibur you sever the dragon's head!"
        },
        new Object[] {
            new MyProjectileStrategy(),
            "You shoot the dragon with the magical crossbow and it falls dead on the ground!"
        },
        new Object[] {
            new MySpellStrategy(),
            "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"
        }

    );

  }

  /**
   * The tested strategy
   */
  private final MyDragonSlayingStrategy strategy;

  /**
   * The expected action on the std-out
   */
  private final String expectedResult;

  /**
   * The mocked standard out {@link PrintStream}, required since some actions don't have any
   * influence of accessible objects, expect for writing to std-out using {@link System#out}
   */
  private final PrintStream stdOutMock = mock(PrintStream.class);

  /**
   * Keep the original std-out so it can be restored after the test
   */
  private final PrintStream stdOutOrig = System.out;

  /**
   * Create a new test instance for the given strategy
   *
   * @param strategy The tested strategy
   * @param expectedResult The expected result
   */
  public MyDragonSlayingStrategyTest(final MyDragonSlayingStrategy strategy, final String expectedResult) {
    this.strategy = strategy;
    this.expectedResult = expectedResult;
  }

  /**
   * Injext the mocked std-out {@link PrintStream} into the {@link System} class before each test
   */
  @Before
  public void setUp() {
    System.setOut(this.stdOutMock);
  }

  /**
   * Removed the mocked std-out {@link PrintStream} again from the {@link System} class
   */
  @After
  public void tearDown() {
    System.setOut(this.stdOutOrig);
  }

  @Test
  public void testExecute() {
    this.strategy.execute();
    verify(this.stdOutMock).println(this.expectedResult);
    verifyNoMoreInteractions(this.stdOutMock);
  }

}
