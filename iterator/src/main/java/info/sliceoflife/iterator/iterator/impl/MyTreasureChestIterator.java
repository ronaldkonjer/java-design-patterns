/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
