package com.eightycolumns.application;

import org.springframework.beans.factory.annotation.Required;

public class Parrot {
  private String adjective;

  @Required
  public void setAdjective(String adjective) {
    this.adjective = adjective;
  }

  public void speak() {
    if (adjective == null) {
      System.out.println("I'm just a parrot.");
    } else {
      System.out.println("I'm a " + adjective + " parrot.");
    }
  }
}
