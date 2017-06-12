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

import info.sliceoflife.visitor.composite.impl.MyCommander;
import info.sliceoflife.visitor.composite.impl.MySergeant;
import info.sliceoflife.visitor.composite.impl.MySoldier;
import info.sliceoflife.visitor.visitor.impl.MyCommanderVisitor;
import info.sliceoflife.visitor.visitor.impl.MySergeantVisitor;
import info.sliceoflife.visitor.visitor.impl.MySoldierVisitor;

/**
 * Visitor Pattern defines mechanism to apply operations on nodes in hierarchy. New operations can
 * be added without altering the node interface.
 * <p>
 * In this example there is a unit hierarchy beginning from {@link MyCommander}. This hierarchy is
 * traversed by visitors. {@link MySoldierVisitor} applies its operation on {@link MySoldier}s,
 * {@link MySergeantVisitor} on @{link MySergeant}s and so on.
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Application entry point
   *
   * @param args command line args
   */
  public static void main(final String[] args) {
    final MyCommander commander =
        new MyCommander(new MySergeant(new MySoldier(), new MySoldier(), new MySoldier()),
            new MySergeant(new MySoldier(), new MySoldier(), new MySoldier()));
    commander.accept(new MySoldierVisitor());
    commander.accept(new MySergeantVisitor());
    commander.accept(new MyCommanderVisitor());
  }

}
