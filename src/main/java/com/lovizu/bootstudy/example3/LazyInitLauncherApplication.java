package com.lovizu.bootstudy.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class CLassA {

}

@Component
@Lazy
class CLassB {

  private final CLassA cLassA;

  public CLassB(CLassA cLassA) {
    System.out.println("생성자 !");
    this.cLassA = cLassA;
  }

  public void doSomething() {
    System.out.println("do something");
  }
}

@Configuration
@ComponentScan
public class LazyInitLauncherApplication {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(LazyInitLauncherApplication.class)) {

      System.out.println("init of context is completed");

      context.getBean(CLassB.class).doSomething();
    }
  }
}
