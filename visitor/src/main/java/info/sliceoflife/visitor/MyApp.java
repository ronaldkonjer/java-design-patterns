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
