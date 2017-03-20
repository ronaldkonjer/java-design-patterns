package info.sliceoflife.chain;

import static org.junit.Assert.assertTrue;

import info.sliceoflife.chain.handler.MyRequest;
import info.sliceoflife.chain.handler.MyRequestType;

import org.junit.Test;

import info.slifeoflife.chain.client.MyOrcKing;

/**
 * MyOrcTest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyOrcKingTest {

  /**
   * All possible requests
   */
  private static final MyRequest[] REQUESTS = new MyRequest[] {
      new MyRequest(MyRequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
      new MyRequest(MyRequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
      new MyRequest(MyRequestType.COLLECT_TAX, "Don't steal, the King hates competition ..."),
  };

  @Test
  public void testMakeRequest() throws Exception {
    final MyOrcKing king = new MyOrcKing();

    for (final MyRequest request : REQUESTS) {
      king.makeRequest(request);
      assertTrue("Expected all requests from King to be handled, but [" + request + "] was not!",
          request.isHandled());
    }

  }

}
