/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
