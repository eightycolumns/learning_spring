package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    LazyBean lazyBean = ac.getBean("lazyBean", LazyBean.class);
    NonLazyBean nonLazyBean = ac.getBean("nonLazyBean", NonLazyBean.class);
  }
}
