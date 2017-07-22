package com.eightycolumns.application;

public class Animal {
  protected String type;

  public Animal(String type) {
    this.type = type;
  }

  public void init() {
    System.out.println("\n######################");
    System.out.println("Initializing animal...");
    System.out.println("######################\n");
  }
}
