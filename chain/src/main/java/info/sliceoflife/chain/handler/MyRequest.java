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
