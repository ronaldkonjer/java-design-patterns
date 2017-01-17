package info.sliceoflife.factory.method.creator;

import info.sliceoflife.factory.method.product.MyWeapon;
import info.sliceoflife.factory.method.product.impl.MyWeaponType;

/**
 * The interface containing method for producing objects.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public interface MyBlacksmith {

  public MyWeapon manufactureWeapon(MyWeaponType type);

}
