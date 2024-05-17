package com.lovizu.bootstudy.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {
  @Bean
  public GameConsole game() {
    return new MarioGame();
  }

  @Bean(name = "temp")
  @Primary
  public GameRunner gameRunner2(GameConsole game) {
    return new GameRunner(game);
  }

  @Bean
  public GameRunner gameRunner(GameConsole game) {
    return new GameRunner(game);
  }
}
