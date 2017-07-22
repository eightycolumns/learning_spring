package com.eightycolumns.application;

public class PartyAnimal extends Animal {
  private String description = "party";

  public PartyAnimal(String type) {
    super(type);
  }

  @Override
  public String speak() {
    return "I'm a " + description + " " + type + ". Watch me party!";
  }
}
