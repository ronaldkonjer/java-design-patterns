package info.sliceoflife.memento;

import static org.junit.Assert.assertEquals;

import info.sliceoflife.memento.memento.MyStarMemento;
import info.sliceoflife.memento.memento.impl.MyStar;
import info.sliceoflife.memento.memento.impl.MyStarType;

import org.junit.Test;

/**
 * MyStar Test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyStartTest {

  /**
   * Verify the stages of a dying sun, without going back in time
   */

  @Test
  public void testTimePassed() {
    final MyStar star = new MyStar(MyStarType.SUN, 1, 2);
    assertEquals("sun age: 1 years mass: 2 tons", star.toString());

    star.timePasses();
    assertEquals("red giant age: 2 years mass: 16 tons", star.toString());

    star.timePasses();
    assertEquals("white dwarf age: 4 years mass: 128 tons", star.toString());

    star.timePasses();
    assertEquals("supernova age: 8 years mass: 1024 tons", star.toString());

    star.timePasses();
    assertEquals("dead star age: 16 years mass: 8192 tons", star.toString());

    star.timePasses();
    assertEquals("dead star age: 64 years mass: 0 tons", star.toString());

    star.timePasses();
    assertEquals("dead star age: 256 years mass: 0 tons", star.toString());
  }

  /**
   * Verify some stage of a dying sun, but go back in time to test the momento
   */
  @Test
  public void testSetMomento() {
    final MyStar star = new MyStar(MyStarType.SUN, 1, 2);
    final MyStarMemento firstMemento = star.getMemento();
    assertEquals("sun age: 1 years mass: 2 tons", star.toString());

    star.timePasses();
    final MyStarMemento secondMemento = star.getMemento();
    assertEquals("red giant age: 2 years mass: 16 tons", star.toString());

    star.timePasses();
    final MyStarMemento thirdMemento = star.getMemento();
    assertEquals("white dwarf age: 4 years mass: 128 tons", star.toString());

    star.timePasses();
    assertEquals("supernova age: 8 years mass: 1024 tons", star.toString());

    star.setMemento(thirdMemento);
    assertEquals("white dwarf age: 4 years mass: 128 tons", star.toString());

    star.timePasses();
    assertEquals("supernova age: 8 years mass: 1024 tons", star.toString());

    star.setMemento(secondMemento);
    assertEquals("red giant age: 2 years mass: 16 tons", star.toString());

    star.setMemento(firstMemento);
    assertEquals("sun age: 1 years mass: 2 tons", star.toString());
  }

}
