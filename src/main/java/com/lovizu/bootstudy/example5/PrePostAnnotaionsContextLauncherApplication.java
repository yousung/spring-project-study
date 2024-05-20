package com.lovizu.bootstudy.example5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {

  private SomeDependentClass someDependentClass;

  public SomeClass(SomeDependentClass someDependentClass) {
    super();
    this.someDependentClass = someDependentClass;
    System.out.println("all ready");
  }

  @PostConstruct
  public void initialize() {
    someDependentClass.getReady();
  }

  @PreDestroy
  public void cleanUp() {
    System.out.println("clean up");
  }
}

@Component
class SomeDependentClass {

  public void getReady() {
    System.out.println("some logic using");
  }
}

@Configuration
@ComponentScan
public class PrePostAnnotaionsContextLauncherApplication {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(
        PrePostAnnotaionsContextLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);
    }
  }
}
