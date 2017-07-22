package com.eightycolumns.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    BoredAnimal boredAnimal = ac.getBean("boredAnimal", BoredAnimal.class);
    System.out.println(boredAnimal.speak());

    PartyAnimal partyAnimal = ac.getBean("partyAnimal", PartyAnimal.class);
    System.out.println(partyAnimal.speak());

    ac.registerShutdownHook();
  }
}
