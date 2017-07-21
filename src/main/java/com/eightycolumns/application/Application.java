package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Instrument oboe = ac.getBean("oboe", Oboe.class);
    Musician oboist = ac.getBean("oboist", Musician.class);

    ((ConfigurableApplicationContext)ac).close();
  }
}
