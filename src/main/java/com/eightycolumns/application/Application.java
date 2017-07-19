package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    ClassA classA = ac.getBean("classA", ClassA.class);
    ClassB classB = ac.getBean("classB", ClassB.class);
    ClassC classC = ac.getBean("classC", ClassC.class);
  }
}
