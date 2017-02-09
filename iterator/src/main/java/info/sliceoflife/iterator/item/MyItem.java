/*
 *
 */
package info.sliceoflife.iterator.item;

/**
 * Item class
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyItem {

  private MyItemType type;
  private final String name;

  public MyItem(final MyItemType type, final String name) {
    this.setType(type);
    this.name = name;
  }

  public MyItemType getType() {
    return type;
  }

  public void setType(final MyItemType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return name;
  }

}
