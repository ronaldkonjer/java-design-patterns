package info.sliceoflife.templatemethod;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.templatemethod.client.MyHalflingThief;
import info.sliceoflife.templatemethod.template.MyStealingMethod;

import org.junit.Test;

/**
 * Test for the MyHalflingThief
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyHalflingThiefTest {

  /**
   * Verify if the thief uses the provided stealing method
   */

  @Test
  public void testSteal() {
    final MyStealingMethod method = mock(MyStealingMethod.class);
    final MyHalflingThief thief = new MyHalflingThief(method);

    thief.steal();
    verify(method).steal();

    verifyNoMoreInteractions(method);
  }

  /**
   * Verify if the thief uses the provided stealing method, and the new method after changing it
   */
  @Test
  public void testChangeMethod() {
    final MyStealingMethod initialMethod = mock(MyStealingMethod.class);
    final MyHalflingThief thief = new MyHalflingThief(initialMethod);

    thief.steal();
    verify(initialMethod).steal();

    final MyStealingMethod newMethod = mock(MyStealingMethod.class);
    thief.changeMethod(newMethod);

    thief.steal();
    verify(newMethod).steal();

    verifyNoMoreInteractions(initialMethod, newMethod);
  }

}
