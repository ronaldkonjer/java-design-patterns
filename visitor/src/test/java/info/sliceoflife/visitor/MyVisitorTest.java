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
