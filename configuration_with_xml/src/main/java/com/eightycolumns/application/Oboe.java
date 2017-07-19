package com.eightycolumns.application;

public class Oboe implements Instrument {
  private static final String NAME = "oboe";

  public static Oboe create() {
    return new Oboe();
  }

  public String name() {
    return NAME;
  }

  public String play() {
    return "glorious sound";
  }
}
