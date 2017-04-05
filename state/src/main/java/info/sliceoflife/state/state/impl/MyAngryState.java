package info.sliceoflife.state.state.impl;

import info.sliceoflife.state.context.MyMammoth;
import info.sliceoflife.state.state.MyState;

/**
 * The angry state implementation
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyAngryState implements MyState {

  private final MyMammoth mammoth;

  public MyAngryState(final MyMammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    System.out.println(String.format("%s is furious!", mammoth));
  }

  @Override
  public void onEnterState() {
    System.out.println(String.format("%s gets angry!", mammoth));
  }

}
