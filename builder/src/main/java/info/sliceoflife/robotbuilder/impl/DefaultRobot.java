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
/*
 *
 */
package info.sliceoflife.robotbuilder.impl;

import info.sliceoflife.robotbuilder.Robot;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class DefaultRobot implements Robot {

  private String head;
  private String torso;
  private String arms;
  private String legs;

  /*
   * (non-Javadoc)
   *
   * @see info.sliceoflife.robotbuilder.Robot#setRobotHead(java.lang.String)
   */
  @Override
  public void setRobotHead(final String head) {
    this.head = head;

  }

  @Override
  public String getRobotHead() {
    return head;
  }

  /*
   * (non-Javadoc)
   *
   * @see info.sliceoflife.robotbuilder.Robot#setRobotTorso(java.lang.String)
   */
  @Override
  public void setRobotTorso(final String torso) {
    this.torso = torso;
  }

  @Override
  public String getRobotTorso() {
    return torso;
  }

  /*
   * (non-Javadoc)
   *
   * @see info.sliceoflife.robotbuilder.Robot#setRobotArms(java.lang.String)
   */
  @Override
  public void setRobotArms(final String arms) {
    this.arms = arms;
  }

  @Override
  public String getRobotArms() {
    return arms;
  }

  /*
   * (non-Javadoc)
   *
   * @see info.sliceoflife.robotbuilder.Robot#setRobotLegs(java.lang.String)
   */
  @Override
  public void setRobotLegs(final String legs) {
    this.legs = legs;
  }

  @Override
  public String getRobotLegs() {
    return legs;
  }
}
