package info.sliceoflife.bridge;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

import info.siceoflife.bridge.abstraction.impl.MyBlindingMagicWeapon;
import info.siceoflife.bridge.implementor.impl.MyExcalibur;

/**
 * MyBlindingMagicWeaponTest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyBlindingMagicWeaponTest extends MyMagicWeaponTest {

  /**
   * Invoke all possible actions on the weapon and check if the actions are executed on the
   * actual underlying weapon implementation.
   */

  @Test
  public void testMyExcalibur() throws Exception {
    final MyExcalibur excalibur = spy(new MyExcalibur());
    final MyBlindingMagicWeapon blindingMagicWeapon = new MyBlindingMagicWeapon(excalibur);

    testMyBasicWeaponActions(blindingMagicWeapon, excalibur);

    blindingMagicWeapon.blind();
    verify(excalibur, times(1)).blindImpl();
    verifyNoMoreInteractions(excalibur);

  }

}
