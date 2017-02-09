package info.sliceoflife.bridge;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.implementor.MyMagicWeaponImpl;

public abstract class MyMagicWeaponTest {

  /**
   * Invoke the basic actions of the given weapon, and test if the underlying weapon
   * implementation is invoked
   *
   * @param weaponImpl The spied weapon implementation where actions are bridged to
   * @param weapon The weapon, handled by the MyApp
   */

  protected final void testMyBasicWeaponActions(final MyMagicWeapon weapon,
      final MyMagicWeaponImpl weaponImpl) {
    assertNotNull(weapon);
    assertNotNull(weaponImpl);
    assertNotNull(weapon.getImpl());

    weapon.swing();
    verify(weaponImpl, times(1)).swingImpl();
    verifyNoMoreInteractions(weaponImpl);

    weapon.wield();
    verify(weaponImpl, times(1)).wieldImpl();
    verifyNoMoreInteractions(weaponImpl);

    weapon.unwield();
    verify(weaponImpl, times(1)).unwieldImpl();
    verifyNoMoreInteractions(weaponImpl);
  }

}
