package info.sliceoflife.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import info.sliceoflife.composite.client.MyMessenger;
import info.sliceoflife.composite.composite.MyLetterComposite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyMessengerTest {

  /**
   * The buffer used to capture every write to {@link System#out}
   */
  private ByteArrayOutputStream stdOutBuffer;

  /**
   * Keep the original std-out so it can be restored after the test
   */
  private final PrintStream realStdOut = System.out;

  /**
   * Inject the mocked std-out {@link PrintStream} into the {@link System} class before each
   * test
   */

  @Before
  public void setUp() {
    this.stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }

  /**
   * Removed the mocked std-out {@link PrintStream} again from the {@link System} class
   */
  @After
  public void tearDown() {
    System.setOut(realStdOut);
  }

  /**
   * Thes the message From Orcs
   */
  @Test
  public void testMessageFromOrcs() {
    final MyMessenger messenger = new MyMessenger();
    testMessage(messenger.messageFromOrcs(), "Where there is a whip there is a way.");
  }

  /**
   * Test the message from the elves
   */
  @Test
  public void testMessageFromElves() {
    final MyMessenger messenger = new MyMessenger();
    testMessage(messenger.messageFromElves(), "Much wind pours from your mouth.");
  }

  /**
   * Test if the given composed message matches the expected message
   *
   * @param composedMessage The composed message, received from the messenger
   * @param message The expected message
   */
  private void testMessage(final MyLetterComposite composedMessage, final String message) {
    // Test if the composed message has the correct number of words
    final String[] words = message.split(" ");
    assertNotNull(composedMessage);
    assertEquals(words.length, composedMessage.count());
    // Print the message to the mocked stdOut...
    composedMessage.print();
    // ... and verify if the message matches with the expected one
    assertEquals(message, new String(this.stdOutBuffer.toByteArray()).trim());
  }

}
