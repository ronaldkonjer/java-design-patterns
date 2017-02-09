/*
 *
 */
package info.sliceoflife.iterator.iterator.impl;

import info.sliceoflife.iterator.aggregate.MyTreasureChest;
import info.sliceoflife.iterator.item.MyItem;
import info.sliceoflife.iterator.item.MyItemType;
import info.sliceoflife.iterator.iterator.MyItemIterator;

import java.util.List;

/**
 * The TreasureChest iterator
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyTreasureChestIterator implements MyItemIterator {

  private final MyTreasureChest chest;
  private int idx;
  private final MyItemType type;

  /**
   * Constructor
   */
  public MyTreasureChestIterator(final MyTreasureChest chest, final MyItemType type) {
    this.chest = chest;
    this.type = type;
    this.idx = -1;
  }

  @Override
  public boolean hasNext() {
    return findNextIdx() != -1;
  }

  @Override
  public MyItem next() {
    idx = findNextIdx();
    if (idx != -1) {
      return chest.getItems().get(idx);
    }
    return null;
  }

  private int findNextIdx() {
    final List<MyItem> items = chest.getItems();
    final boolean found = false;
    int tempIdx = idx;
    while (!found) {
      tempIdx++;
      if (tempIdx >= items.size()) {
        tempIdx = -1;
        break;
      }
      if (type.equals(MyItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
        break;
      }
    }
    return tempIdx;
  }
}
