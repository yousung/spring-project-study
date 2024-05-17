package com.lovizu.bootstudy.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContext {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContext.class)) {
//      Arrays.stream(context.getBeanDefinitionNames())
//          .forEach(System.out::println);

      System.out.println(context.getBean(BusinessCalculationService.class).findMax());
      ;
    }
  }
}
