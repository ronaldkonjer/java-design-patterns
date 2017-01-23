package info.sliceoflife.prototype.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import info.sliceoflife.prototype.heroprototype.MyPrototype;
import info.sliceoflife.prototype.heroprototype.impl.MyElfBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyElfMage;
import info.sliceoflife.prototype.heroprototype.impl.MyElfWarlord;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcMage;
import info.sliceoflife.prototype.heroprototype.impl.MyOrcWarlord;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.iluwatar.prototype.Prototype;

/**
 * Prototype test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyHeroPrototypeTest<P extends Prototype> {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[] {new MyOrcBeast(), "Orcish wolf"},
        new Object[] {new MyOrcMage(), "Orcish mage"},
        new Object[] {new MyOrcWarlord(), "Orcish warlord"},
        new Object[] {new MyElfBeast(), "Elven eagle"},
        new Object[] {new MyElfMage(), "Elven mage"},
        new Object[] {new MyElfWarlord(), "Elven warlord"});
  }

  /**
   * The tested prototype instance
   */
  private final MyPrototype testedPrototype;

  /**
   * The expected {@link MyPrototype#toString()} value
   */
  private final String expectedToString;

  /**
   * Create a new test instance, using the given test object and expected value
   *
   * @param testedPrototype The tested Prototype
   * @param expectedToString The expected {@link MyPrototype#toString()} value
   */
  public MyHeroPrototypeTest(final MyPrototype testedPrototype, final String expectedToString) {
    this.expectedToString = expectedToString;
    this.testedPrototype = testedPrototype;
  }

  @Test
  public void testMyProtoType() throws Exception {
    assertEquals(this.expectedToString, this.testedPrototype.toString());

    final Object clone = this.testedPrototype.clone();
    assertNotNull(clone);
    assertNotSame(clone, this.testedPrototype);
    assertSame(this.testedPrototype.getClass(), clone.getClass());
  }

}
