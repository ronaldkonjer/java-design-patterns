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
package info.sliceoflife.robotbuilder;

/**
 * the robot engineer aka robot director
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */

public class RobotDirector {

  private final RobotBuilder robotBuilder; // it has robots inside of it.

  public RobotDirector(final RobotBuilder robotBuilder) {
    this.robotBuilder = robotBuilder;
  }

  public Robot getRobot() {
    return this.robotBuilder.getRobot();
  }

  /**
   * Creates a robot
   */
  public void makeRobot() {
    this.robotBuilder.buildRobotHead();
    this.robotBuilder.buildRobotTorso();
    this.robotBuilder.buildRobotArms();
    this.robotBuilder.buildRobotLegs();
  }

}
