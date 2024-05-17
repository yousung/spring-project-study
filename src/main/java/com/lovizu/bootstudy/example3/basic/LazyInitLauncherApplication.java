package com.lovizu.bootstudy.example3.basic;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LazyInitLauncherApplication {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(LazyInitLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);
    }
  }
}
