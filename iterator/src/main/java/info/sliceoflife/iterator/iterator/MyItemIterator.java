/*
 *
 */
package info.sliceoflife.iterator.iterator;

import info.sliceoflife.iterator.item.MyItem;

/**
 * The ItemIterator interface
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public interface MyItemIterator {

  boolean hasNext();

  MyItem next();

}
