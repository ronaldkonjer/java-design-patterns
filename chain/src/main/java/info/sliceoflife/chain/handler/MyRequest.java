package info.sliceoflife.chain.handler;

import java.util.Objects;

/**
 * MyRequest
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class MyRequest {

  /**
   * The type of this request, used by each in the hain to see if they should or can handle
   * this particular request.
   */
  private final MyRequestType requestType;

  /**
   * A description of the request
   */
  private final String requestDescription;

  /**
   * Indicates if the request is handled or not. A request can only switch state from unhandled to
   * handled, there's no way to 'unhandle' a request.
   */
  private boolean handled;

  /**
   * Create a new request of the given type and accompanied description
   *
   * @param requestTyoe The type of the request
   * @param requestDescription The description of the request
   */

  public MyRequest(final MyRequestType requestType, final String requestDescription) {
    this.requestType = Objects.requireNonNull(requestType);
    this.requestDescription = Objects.requireNonNull(requestDescription);
  }

  /**
   * Get the description of the request
   *
   * @return A human readable description of the request
   */
  public String getRequestDescription() {
    return requestDescription;
  }

  /**
   * Get the type of this request, used by each person in the chain of command to see if they
   * should or can handle this particular request
   * 
   * @return The requestType
   */
  public MyRequestType getRequestType() {
    return requestType;
  }

  /**
   * Mark the request as handled
   */
  public void markHandled() {
    this.handled = true;
  }

  /**
   * Indicates if this request is handled
   *
   * @return <tt>true</tt> when the request is handled, otherwise <tt>false</tt>
   */
  public boolean isHandled() {
    return this.handled;
  }

  @Override
  public String toString() {
    return getRequestDescription();
  }

}
