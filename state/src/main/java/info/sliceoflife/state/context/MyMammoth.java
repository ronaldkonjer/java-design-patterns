package info.sliceoflife.state.context;

import info.sliceoflife.state.state.MyState;
import info.sliceoflife.state.state.impl.MyAngryState;
import info.sliceoflife.state.state.impl.MyPeacefulState;

/**
 * MyMammoth has internal state that defines its behavior (Context)
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyMammoth {

  private MyState state;

  public MyMammoth() {
    state = new MyPeacefulState(this);
  }

  /**
   * Makes time pass for the mammoth
   */
  public void timePasses() {
    if (state.getClass().equals(MyPeacefulState.class)) {
      changeStateTo(new MyAngryState(this));
    } else {
      changeStateTo(new MyPeacefulState(this));
    }
  }

  private void changeStateTo(final MyState newState) {
    this.state = newState;
    this.state.onEnterState();
  }

  @Override
  public String toString() {
    return "The mammoth";
  }

  public void observe() {
    this.state.observe();
  }

}
