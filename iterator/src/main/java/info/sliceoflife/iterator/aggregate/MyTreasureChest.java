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
