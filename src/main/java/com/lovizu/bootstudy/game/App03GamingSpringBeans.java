package com.lovizu.bootstudy.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
//      context.getBean(GameConsole.class).up();
      context.getBean(GameRunner.class).runner();
    }
  }
}
