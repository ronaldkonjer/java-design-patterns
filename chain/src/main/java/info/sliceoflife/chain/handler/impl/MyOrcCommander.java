package info.sliceoflife.chain.handler.impl;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestHandler;
import info.sliceoflife.chain.handler.MyRequestType;

/**
 * MyOrcCommander
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcCommander extends MyRequestHandler {

  public MyOrcCommander(final MyRequestHandler handler) {
    super(handler);
  }

  @Override
  public void handleRequest(final MyRequest request) {
    if (request.getRequestType().equals(MyRequestType.DEFEND_CASTLE)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }

  @Override
  public String toString() {
    return "Orc commander";
  }

}
