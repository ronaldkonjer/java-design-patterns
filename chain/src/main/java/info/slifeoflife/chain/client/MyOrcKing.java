package info.slifeoflife.chain.client;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestHandler;
import info.sliceoflife.chain.handler.impl.MyOrcCommander;
import info.sliceoflife.chain.handler.impl.MyOrcOfficer;
import info.sliceoflife.chain.handler.impl.MyOrcSoldier;

/**
 * MyOrcKing makes requests that are handled by the chain.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcKing {

  MyRequestHandler chain;

  public MyOrcKing() {
    buildChain();
  }

  private void buildChain() {
    chain = new MyOrcCommander(
        new MyOrcOfficer(
            new MyOrcSoldier(null)));
  }

  public void makeRequest(final MyRequest request) {
    chain.handleRequest(request);
  }

}
