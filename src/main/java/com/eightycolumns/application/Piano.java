package com.eightycolumns.application;

public class Piano implements Instrument {
  private static final String NAME = "piano";

  public String name() {
    return NAME;
  }

  public String play() {
    return "Behold the glorious sound of the " + NAME + "!";
  }
}
