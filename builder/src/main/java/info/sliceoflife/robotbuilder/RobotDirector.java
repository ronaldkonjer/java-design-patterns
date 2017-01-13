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

  public void makeRobot() {
    this.robotBuilder.buildRobotHead();
    this.robotBuilder.buildRobotTorso();
    this.robotBuilder.buildRobotArms();
    this.robotBuilder.buildRobotLegs();
  }

}
