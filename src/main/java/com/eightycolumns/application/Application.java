package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Instrument oboe = ac.getBean("oboe", Oboe.class);
    Instrument anotherOboe = ac.getBean("oboe", Oboe.class);

    Instrument piano = ac.getBean("piano", Piano.class);
    Instrument anotherPiano = ac.getBean("piano", Piano.class);

    if (oboe == anotherOboe) {
      System.out.println("The oboes are identical!");
    } else {
      System.out.println("The oboes aren't identical!");
    }

    if (piano == anotherPiano) {
      System.out.println("The pianos are identical!");
    } else {
      System.out.println("The pianos aren't identical!");
    }
  }
}
