package com.eightycolumns.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Parrot boredParrot = ac.getBean("boredParrot", Parrot.class);
    Parrot ninjaParrot = ac.getBean("ninjaParrot", Parrot.class);
    Parrot partyParrot = ac.getBean("partyParrot", Parrot.class);

    boredParrot.speak();
    ninjaParrot.speak();
    partyParrot.speak();

    ac.registerShutdownHook();
  }
}
