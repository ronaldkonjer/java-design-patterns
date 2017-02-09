package info.sliceoflife.composite;

import info.sliceoflife.composite.client.MyMessenger;
import info.sliceoflife.composite.composite.MyLetterComposite;

/**
 * The Composite Pattern is a partitioning design pattern. The Composite Pattern describes
 * that a group of objects is to be treated in the same way as a single instance of an object.
 * The intent of a composite is to "compose" objects into tree structures to represent
 * part-whole hierarchies. Implementing the Cpmposite Pattern lets clients treat individual
 * objects and compositions uniformly
 * <p>
 * In this example we have sentences composed of words composed of letters. All of the objects
 * can be treated through the same interface ({@link MyLetterComposite})
 * 
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyApp {

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(final String[] arg) {
    System.out.println("Message from the orcs: ");

    final MyLetterComposite orcMessage = new MyMessenger().messageFromOrcs();
    orcMessage.print();

    System.out.println("\n");

    System.out.println("Message from the elves: ");

    final MyLetterComposite elfMessage = new MyMessenger().messageFromElves();
    elfMessage.print();
  }

}
