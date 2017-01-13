/*
 *
 */
package info.sliceoflife.robotbuilder;

/**
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public interface Robot {

  public void setRobotHead(String head);

  public String getRobotHead();

  public void setRobotTorso(String torso);

  public String getRobotTorso();

  public void setRobotArms(String arms);

  public String getRobotArms();

  public void setRobotLegs(String legs);

  public String getRobotLegs();

}
