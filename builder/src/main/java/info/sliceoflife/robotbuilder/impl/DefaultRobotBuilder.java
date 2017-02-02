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
package info.sliceoflife.robotbuilder.impl;

import info.sliceoflife.robotbuilder.Robot;
import info.sliceoflife.robotbuilder.RobotBuilder;

public class DefaultRobotBuilder implements RobotBuilder {

  private final Robot robot;

  public DefaultRobotBuilder() {
    this.robot = new DefaultRobot();
  }

  @Override
  public void buildRobotHead() {
    robot.setRobotHead("Tin Head");
  }

  @Override
  public void buildRobotTorso() {
    robot.setRobotTorso("Tin Torso");
  }

  @Override
  public void buildRobotArms() {
    robot.setRobotArms("Blowtorch Arms");
  }

  @Override
  public void buildRobotLegs() {
    robot.setRobotLegs("Roller Skates");
  }

  @Override
  public Robot getRobot() {
    return this.robot;
  }

}
