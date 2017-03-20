package info.sliceoflife.chain.handler.impl;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestHandler;
import info.sliceoflife.chain.handler.MyRequestType;

/**
 * MyOrcSoldier
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcSoldier extends MyRequestHandler {

  public MyOrcSoldier(final MyRequestHandler handler) {
    super(handler);
  }

  @Override
  public void handleRequest(final MyRequest request) {
    if (request.getRequestType().equals(MyRequestType.COLLECT_TAX)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }

  @Override
  public String toString() {
    return "Orc soldier";
  }

}
