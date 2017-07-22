package com.eightycolumns.application;

public class BoredAnimal extends Animal {
  private String description = "bored";

  public BoredAnimal(String type) {
    super(type);
  }

  public void init() {
    System.out.println("\n############################");
    System.out.println("Initializing bored animal...");
    System.out.println("############################\n");
  }

  public void speak() {
    System.out.println("\n###################################");

    System.out.println(
      "I'm a " + description + " " + type + ". I'm so bored..."
    );

    System.out.println("###################################\n");
  }
}
