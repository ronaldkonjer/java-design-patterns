package info.sliceoflife.chain.handler.impl;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestHandler;
import info.sliceoflife.chain.handler.MyRequestType;

/**
 * MyOrcOfficer
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcOfficer extends MyRequestHandler {

  public MyOrcOfficer(final MyRequestHandler handler) {
    super(handler);
  }

  @Override
  public void handleRequest(final MyRequest request) {
    if (request.getRequestType().equals(MyRequestType.TORTURE_PRISONER)) {
      printHandling(request);
      request.markHandled();
    } else {
      super.handleRequest(request);
    }
  }

  @Override
  public String toString() {
    return "Orc officer";
  }
}
