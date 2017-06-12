/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
