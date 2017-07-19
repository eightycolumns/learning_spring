package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    Foo foo = ac.getBean("foo", Foo.class);
    Bar bar = ac.getBean("bar", Bar.class);
  }
}
