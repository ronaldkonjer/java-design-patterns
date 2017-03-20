package info.sliceoflife.chain;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestHandler;
import info.sliceoflife.chain.handler.MyRequestType;
import info.sliceoflife.chain.handler.impl.MyOrcCommander;
import info.sliceoflife.chain.handler.impl.MyOrcOfficer;
import info.sliceoflife.chain.handler.impl.MyOrcSoldier;

import info.slifeoflife.chain.client.MyOrcKing;

/**
 * The Chain of Responsibility pattern is a design pattern consisting of command objects and a
 * series of processing objects. Each processing object contains logic that defines the types
 * of command objects that it can handle; the rest are passed to the next processing object in
 * the chain. A mechanism also exists for adding new processing objects to the end of this chain.
 * <p>
 * In this example we organize the request handlers ({@link MyRequestHandler}) into a chain where
 * each handler has a chance to act on the request on its turn. Here the king ({@link MyOrcKing})
 * makes requests and the military orcs ({@link MyOrcCommander}, {@link MyOrcOfficer},
 * {@link MyOrcSoldier})
 * form the handler chain.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyApp {

  /**
   * THe program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyOrcKing king = new MyOrcKing();
    king.makeRequest(new MyRequest(MyRequestType.DEFEND_CASTLE, "defend castle"));
    king.makeRequest(new MyRequest(MyRequestType.TORTURE_PRISONER, "torture prisoner"));
    king.makeRequest(new MyRequest(MyRequestType.COLLECT_TAX, "collect tax"));

  }

}
