/*
 *
 */
package info.sliceoflife.robotbuilder;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public interface RobotBuilder {

  public void buildRobotHead();

  public void buildRobotTorso();

  public void buildRobotArms();

  public void buildRobotLegs();

  public Robot getRobot();

}
