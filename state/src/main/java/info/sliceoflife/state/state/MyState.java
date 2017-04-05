package info.sliceoflife.state.state;

/**
 * The State interface
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public interface MyState {

  void observe();

  void onEnterState();
}
