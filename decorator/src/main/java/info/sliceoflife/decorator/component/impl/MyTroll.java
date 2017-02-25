package info.sliceoflife.decorator.component.impl;

import info.sliceoflife.decorator.component.MyHostile;

public class MyTroll implements MyHostile {

  @Override
  public int getAttackPower() {
    return 10;
  }

  @Override
  public void attack() {
    System.out.println("The troll swings at you with a club!");

  }

  @Override
  public void fleeBattle() {
    System.out.println("The troll shrieks in horror and runs away!");
  }

}
