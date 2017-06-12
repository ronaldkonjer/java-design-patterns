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
