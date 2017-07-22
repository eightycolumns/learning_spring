package com.eightycolumns.application;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
  public Object
  postProcessBeforeInitialization(Object bean, String beanName)
  throws BeansException {
    System.out.println("\n###############################################");
    System.out.println("Greetings from postProcessBeforeInitialization!");
    System.out.println("Bean Name: " + beanName);
    System.out.println("###############################################\n");
    return bean;
  }

  public Object
  postProcessAfterInitialization(Object bean, String beanName)
  throws BeansException {
    System.out.println("\n##############################################");
    System.out.println("Greetings from postProcessAfterInitialization!");
    System.out.println("Bean Name: " + beanName);
    System.out.println("##############################################\n");
    return bean;
  }
}
