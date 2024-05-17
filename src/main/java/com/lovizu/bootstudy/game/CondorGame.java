package com.lovizu.bootstudy.game;

import org.springframework.stereotype.Component;

@Component
public class CondorGame implements GameConsole {

  @Override
  public void name() {
    System.out.println("수퍼 콘도라");
  }

  @Override
  public void up() {
    System.out.println("위로");
  }

  @Override
  public void down() {
    System.out.println("아래로");
  }

  @Override
  public void left() {
    System.out.println("왼쪽");
  }

  @Override
  public void right() {
    System.out.println("오른쪽");
  }
}
