package com.lovizu.bootstudy.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole {

  @Override
  public void name() {
    System.out.println("수퍼마리오");
  }

  @Override
  public void up() {
    System.out.println("점프");
  }

  @Override
  public void down() {
    System.out.println("파이프로 들어가기");
  }

  @Override
  public void left() {
    System.out.println("뒤로 돌아가기");
  }

  @Override
  public void right() {
    System.out.println("달리기");
  }
}
