package com.eightycolumns.application;

public class Oboe implements Instrument {
  private static final String NAME = "oboe";

  public String name() {
    return NAME;
  }

  public String play() {
    return "Behold the glorious sound of the " + NAME + "!";
  }
}
