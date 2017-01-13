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

  public String getRobotLegs() {
    return legs;
  }
}
