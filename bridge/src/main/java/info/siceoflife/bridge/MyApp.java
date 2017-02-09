package info.siceoflife.bridge;

import info.siceoflife.bridge.abstraction.MyMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MyBlindingMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MyFlyingMagicWeapon;
import info.siceoflife.bridge.abstraction.impl.MySoulEatingMagicWeapon;
import info.siceoflife.bridge.implementor.MyMagicWeaponImpl;
import info.siceoflife.bridge.implementor.impl.MyExcalibur;
import info.siceoflife.bridge.implementor.impl.MyMjollnir;
import info.siceoflife.bridge.implementor.impl.MyStormbringer;

/**
 * The Bridge pattern can als be thought of as two layers of abstraction. With Bridge, you
 * can decouple an abstraction from its implementation so that the two can vary independently.
 * <p>
 * In Bridge pattern both abstraction ({@link MyMagicWeapon}) and implementation
 * ({@link MyMagicWeaponImpl}) have their own class hierarchies. The interface of the
 * implementations can be changed without affecting the clients.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * Program entry points
   *
   * @param args command line args.
   */

  public static void main(final String[] args) {
    final MyBlindingMagicWeapon blindingMagicWeapon = new MyBlindingMagicWeapon(new MyExcalibur());
    blindingMagicWeapon.wield();
    blindingMagicWeapon.blind();
    blindingMagicWeapon.swing();
    blindingMagicWeapon.unwield();

    final MyFlyingMagicWeapon flyingMagicWeapon = new MyFlyingMagicWeapon(new MyMjollnir());
    flyingMagicWeapon.wield();
    flyingMagicWeapon.fly();
    flyingMagicWeapon.swing();
    flyingMagicWeapon.unwield();

    final MySoulEatingMagicWeapon soulEatingMagicWeapon = new MySoulEatingMagicWeapon(new MyStormbringer());
    soulEatingMagicWeapon.wield();
    soulEatingMagicWeapon.swing();
    soulEatingMagicWeapon.eatSoul();
    soulEatingMagicWeapon.unwield();

  }

}
