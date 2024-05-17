package com.lovizu.bootstudy.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

  GameConsole game;

  public GameRunner(GameConsole game) {
    this.game = game;
  }

  public void runner() {
    System.out.println("==========");
    game.name();
    System.out.println("==========");
    game.up();
    game.down();
    game.left();
    game.right();
  }
}
