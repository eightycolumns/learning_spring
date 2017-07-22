package com.eightycolumns.application;

public class BoredAnimal extends Animal {
  private String description = "bored";

  public BoredAnimal(String type) {
    super(type);
  }

  @Override
  public String speak() {
    return "I'm a " + description + " " + type + ". I'm so bored...";
  }
}
