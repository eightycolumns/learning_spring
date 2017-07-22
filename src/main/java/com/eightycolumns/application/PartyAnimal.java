package com.eightycolumns.application;

public class PartyAnimal extends Animal {
  private String description = "party";

  public PartyAnimal(String type) {
    super(type);
  }

  public void init() {
    System.out.println("\n############################");
    System.out.println("Initializing party animal...");
    System.out.println("############################\n");
  }

  public void speak() {
    System.out.println("\n###################################");

    System.out.println(
      "I'm a " + description + " " + type + ". Watch me party!"
    );

    System.out.println("###################################\n");
  }
}
