package info.sliceoflife.command.receiver.impl;

import info.sliceoflife.command.command.impl.MySize;
import info.sliceoflife.command.command.impl.MyVisibility;
import info.sliceoflife.command.receiver.MyTarget;

/**
 * MyGoblin is the target of the spells
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyGoblin extends MyTarget {

  public MyGoblin() {
    setSize(MySize.NORMAL);
    setVisibility(MyVisibility.VISIBLE);
  }

  @Override
  public String toString() {
    return "Goblin";
  }

}
