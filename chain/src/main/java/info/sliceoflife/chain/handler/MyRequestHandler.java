package info.sliceoflife.chain.handler;

/**
 * MyRequestHandler
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public abstract class MyRequestHandler {

  private final MyRequestHandler next;

  public MyRequestHandler(final MyRequestHandler next) {
    this.next = next;
  }

  /**
   * Request handler
   */
  public void handleRequest(final MyRequest request) {
    if (next != null) {
      next.handleRequest(request);
    }
  }

  protected void printHandling(final MyRequest request) {
    System.out.println(this + " handling request \"" + request + "\"");
  }

  @Override
  public abstract String toString();

}
