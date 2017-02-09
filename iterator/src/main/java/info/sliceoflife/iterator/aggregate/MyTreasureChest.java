/*
 *
 */
package info.sliceoflife.iterator.aggregate;

import info.sliceoflife.iterator.item.MyItem;
import info.sliceoflife.iterator.item.MyItemType;
import info.sliceoflife.iterator.iterator.MyItemIterator;
import info.sliceoflife.iterator.iterator.impl.MyTreasureChestIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TreasureChest, the collection class a.k.a. aggregate class
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyTreasureChest {

  private final List<MyItem> items;

  /**
   * Constructor
   */
  public MyTreasureChest() {
    items = new ArrayList<>();
    items.add(new MyItem(MyItemType.POTION, "Potion of courage"));
    items.add(new MyItem(MyItemType.RING, "Ring of shadows"));
    items.add(new MyItem(MyItemType.POTION, "Potion of wisdom"));
    items.add(new MyItem(MyItemType.POTION, "Potion of blood"));
    items.add(new MyItem(MyItemType.WEAPON, "Sword of silver +1"));
    items.add(new MyItem(MyItemType.POTION, "Potion of rust"));
    items.add(new MyItem(MyItemType.POTION, "Potion of healing"));
    items.add(new MyItem(MyItemType.RING, "Ring of armor"));
    items.add(new MyItem(MyItemType.WEAPON, "Steel halberd"));
    items.add(new MyItem(MyItemType.WEAPON, "Dagger of poison"));
  }

  public MyItemIterator iterator(final MyItemType itemType) {
    return new MyTreasureChestIterator(this, itemType);
  }

  /**
   * Get all items
   * 
   * @return list List with all items
   */
  public List<MyItem> getItems() {
    final List<MyItem> list = new ArrayList<>();
    list.addAll(items);
    return list;
  }

}
