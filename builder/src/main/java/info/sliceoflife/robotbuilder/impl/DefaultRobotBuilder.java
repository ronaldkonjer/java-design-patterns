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
