package info.sliceoflife.observer;

import static org.mockito.Mockito.mock;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

/**
 * MyStdOut test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyStdOutTest {

  /**
   * The mocked standard out {@link PrintStream}, required since changes in the weather doesn't has
   * any influence on any other accessible objexts, except for writing to std-out using
   * {@link System#out}
   */
  private final PrintStream stdOutMock = mock(PrintStream.class);

  /**
   * Keep the reference to the original std-out so it can be restored after the test
   */
  private final PrintStream stdOutOrig = System.out;

  /**
   * Inject the mocked std-out {@link PrintStream} into the {@link System} class before each test
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

  protected final PrintStream getStdOutMock() {
    return this.stdOutMock;
  }

}
