package com.eightycolumns.application;

public class Animal {
  protected String type;

  public Animal(String type) {
    this.type = type;
  }

  public String speak() {
    return "I'm just a " + type + ".";
  }
}
