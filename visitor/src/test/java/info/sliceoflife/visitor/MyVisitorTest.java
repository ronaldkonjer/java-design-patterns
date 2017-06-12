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
package info.sliceoflife.visitor;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.composite.impl.MySoldier;
import info.sliceoflife.visitor.visitor.MyUnitVisitor;

import java.util.Optional;

import org.junit.Test;

/**
 * Abstract test for Visitor
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public abstract class MyVisitorTest<V extends MyUnitVisitor> extends MyStdOutTest {

  /**
   * The tested visitor instance
   */
  private final V visitor;

  /**
   * The optional expected response when being visited by a myCommander
   */
  private final Optional<String> myCommanderResponse;

  /**
   * The optional expected response when being visited by a mySergeant
   */
  private final Optional<String> mySergeantResponse;

  /**
   * The optional expected response when being visited by a mySoldier
   */
  private final Optional<String> mySoldierResponse;

  /**
   * Create a new test instance for the given visitor
   *
   * @param myCommanderResponse The optional expected response when being visited by a myCommander
   * @param mySergeantResponse The optional expected response when being visited by a mySergeant
   * @param mySoldierResponse The optional expected response when being visited by a mySoldier
   */
  public MyVisitorTest(final V visitor, final Optional<String> myCommanderResponse,
      final Optional<String> mySergeantResponse, final Optional<String> mySoldierResponse) {
    this.visitor = visitor;
    this.myCommanderResponse = myCommanderResponse;
    this.mySergeantResponse = mySergeantResponse;
    this.mySoldierResponse = mySoldierResponse;
  }

  @Test
  public void testVisitMyCommander() {
    this.visitor.visitCommander(new MyCommander());
    if (this.myCommanderResponse.isPresent()) {
      verify(getStdOutMock()).println(this.myCommanderResponse.get());
    }
    verifyNoMoreInteractions(getStdOutMock());
  }

  @Test
  public void testVisitMySergeant() {
    this.visitor.visitSergeant(new MySergeant());
    if (this.mySergeantResponse.isPresent()) {
      verify(getStdOutMock()).println(this.mySergeantResponse.get());
    }
    verifyNoMoreInteractions(getStdOutMock());
  }

  @Test
  public void testVisitMySoldier() {
    this.visitor.visitSoldier(new MySoldier());
    if (this.mySoldierResponse.isPresent()) {
      verify(getStdOutMock()).println(this.mySoldierResponse.get());
    }
    verifyNoMoreInteractions(getStdOutMock());
  }

}
