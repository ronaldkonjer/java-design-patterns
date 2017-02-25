package info.sliceoflife.decorator.decorator;

import info.sliceoflife.decorator.component.MyHostile;

import com.iluwatar.decorator.Hostile;

/**
 * SmartHostile is a decorator for {@link Hostile} objects. The call to the {@link Hostile}
 * interface are intercepted and decorated. Finally the calls are delegated to the decorated
 * {@link Hostile} object.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MySmartHostile implements MyHostile {

  // Each decorator HAS-A(WRAPS) component
  private final MyHostile decorated;

  public MySmartHostile(final MyHostile decorated) {
    this.decorated = decorated;
  }

  @Override
  public void attack() {
    System.out.println("It throws a rock at you!");
    decorated.attack();
  }

  @Override
  public int getAttackPower() {
    return decorated.getAttackPower() + 20;
  }

  @Override
  public void fleeBattle() {
    System.out.println("It calls for help!");
    decorated.fleeBattle();
  }

}
