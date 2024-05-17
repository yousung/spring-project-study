package com.lovizu.bootstudy.game;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);
    }
  }
}
