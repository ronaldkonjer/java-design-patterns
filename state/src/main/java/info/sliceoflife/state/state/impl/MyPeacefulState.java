package info.sliceoflife.state.state.impl;

import info.sliceoflife.state.context.MyMammoth;
import info.sliceoflife.state.state.MyState;

/**
 * The peaceful state implementation
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyPeacefulState implements MyState {

  private final MyMammoth mammoth;

  public MyPeacefulState(final MyMammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    System.out.println(String.format("%s is calm and peaceful.", mammoth));
  }

  @Override
  public void onEnterState() {
    System.out.println(String.format("%s calms down.", mammoth));

  }

}
