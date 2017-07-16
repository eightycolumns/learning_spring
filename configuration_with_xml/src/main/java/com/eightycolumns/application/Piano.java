package com.eightycolumns.application;

public class Piano implements Instrument {
  private static final String NAME = "piano";

  private Piano() {}

  public static Piano create() {
    return new Piano();
  }

  public String name() {
    return NAME;
  }

  public String play() {
    return "glorious sound";
  }
}
