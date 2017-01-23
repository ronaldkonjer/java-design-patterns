/*
 *
 */
package info.sliceoflife.singleton.towersingleton;

/**
 * Enum bases Singleton implementation.
 * Effective Java 2nd Edition (Joshua Bloch) p. 18.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum MyEnumIvoryTower {

  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }

}
