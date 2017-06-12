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
package info.sliceoflife.proxy;

import static org.mockito.Mockito.inOrder;

import info.sliceoflife.proxy.pojo.MyWizard;
import info.sliceoflife.proxy.proxy.MyWizardTowerProxy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;

/**
 * MyTower test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizardTowerTest extends MyStdOutTest {

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
