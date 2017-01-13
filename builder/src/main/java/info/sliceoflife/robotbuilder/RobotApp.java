package info.sliceoflife.robotbuilder;

import info.sliceoflife.robotbuilder.impl.DefaultRobotBuilder;

public class RobotApp {

  public static void main(final String[] args) {
    final RobotBuilder robot = new DefaultRobotBuilder();

    final RobotDirector director = new RobotDirector(robot);

    director.makeRobot();

    final Robot defaultRobot = director.getRobot();

    System.out.println("Robot Built");

    System.out.println("Robot Head Type: " + defaultRobot.getRobotHead());

    System.out.println("Robot Head Type: " + defaultRobot.getRobotTorso());

    System.out.println("Robot Head Type: " + defaultRobot.getRobotArms());

    System.out.println("Robot Head Type: " + defaultRobot.getRobotLegs());
  }

}
