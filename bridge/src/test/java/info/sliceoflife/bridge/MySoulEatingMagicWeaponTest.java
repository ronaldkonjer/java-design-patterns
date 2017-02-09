package info.sliceoflife.bridge;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

import info.siceoflife.bridge.abstraction.impl.MySoulEatingMagicWeapon;
import info.siceoflife.bridge.implementor.impl.MyStormbringer;

/**
 * MySoulEatingMagicWeaponTest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MySoulEatingMagicWeaponTest extends MyMagicWeaponTest {

  /**
   * Invoke all possible actions on the weapon and check if the actions are executed on the
   * actual underlying weapon implementation.
   */

  @Test
  public void testStormBringer() throws Exception {
    final MyStormbringer stormbringer = spy(new MyStormbringer());
    final MySoulEatingMagicWeapon soulEatingMagicWeapon = new MySoulEatingMagicWeapon(stormbringer);

    testMyBasicWeaponActions(soulEatingMagicWeapon, stormbringer);

    soulEatingMagicWeapon.eatSoul();
    verify(stormbringer, times(1)).eatSoulImpl();
    verifyNoMoreInteractions(stormbringer);
  }

}
