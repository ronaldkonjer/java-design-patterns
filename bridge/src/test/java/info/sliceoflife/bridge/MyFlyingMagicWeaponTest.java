package info.sliceoflife.bridge;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

import info.siceoflife.bridge.abstraction.impl.MyFlyingMagicWeapon;
import info.siceoflife.bridge.implementor.impl.MyMjollnir;

/**
 * MyFlyingMagicWeaponTest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyFlyingMagicWeaponTest extends MyMagicWeaponTest {

  /**
   * Invokes all possible actions on the weapon and check if the actions are executed on the
   * actual underlying weapon implementation.
   */
  @Test
  public void testMyMjollnir() throws Exception {
    final MyMjollnir mjollnir = spy(new MyMjollnir());
    final MyFlyingMagicWeapon flyingMagicWeapon = new MyFlyingMagicWeapon(mjollnir);

    testMyBasicWeaponActions(flyingMagicWeapon, mjollnir);

    flyingMagicWeapon.fly();
    verify(mjollnir, times(1)).flyImpl();
    verifyNoMoreInteractions(mjollnir);

  }

}
