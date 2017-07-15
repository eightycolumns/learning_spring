package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Instrument oboe = ac.getBean("oboe", Oboe.class);
    Instrument piano = ac.getBean("piano", Piano.class);

    System.out.println("Behold the " + oboe.play() + " of the oboe!");
    System.out.println("Behold the " + piano.play() + " of the piano!");
  }
}
