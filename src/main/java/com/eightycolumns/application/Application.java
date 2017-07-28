package com.eightycolumns.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Instrument oboe = (Instrument)context.getBean("oboe");
    Musician oboist = (Musician)context.getBean("oboist");

    oboe.play();
    oboist.instrument().play();
  }
}
