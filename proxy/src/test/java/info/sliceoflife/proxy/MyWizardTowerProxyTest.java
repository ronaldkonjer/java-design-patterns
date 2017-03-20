package info.sliceoflife.proxy;

import static org.mockito.Mockito.inOrder;

import info.sliceoflife.proxy.pojo.MyWizard;
import info.sliceoflife.proxy.proxy.MyWizardTowerProxy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;

/**
 * Test the Proxy
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizardTowerProxyTest extends MyStdOutTest {

  @Test
  public void testEnter() throws Exception {
    final List<MyWizard> wizards = new ArrayList<>();
    wizards.add(new MyWizard("Gandalf"));
    wizards.add(new MyWizard("Dumbledore"));
    wizards.add(new MyWizard("Oz"));
    wizards.add(new MyWizard("Merlin"));

    final MyWizardTowerProxy tower = new MyWizardTowerProxy();
    wizards.forEach(wizard -> tower.enter(wizard));

    final InOrder inOrder = inOrder(getStdOutMock());
    inOrder.verify(getStdOutMock()).println("Gandalf enters the tower.");
    inOrder.verify(getStdOutMock()).println("Dumbledore enters the tower.");
    inOrder.verify(getStdOutMock()).println("Oz enters the tower.");
    inOrder.verify(getStdOutMock()).println("Merlin is not allowed to enter!");
    inOrder.verifyNoMoreInteractions();
  }

}
