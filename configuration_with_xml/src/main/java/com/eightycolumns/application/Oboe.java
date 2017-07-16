package com.eightycolumns.application;

public class Oboe implements Instrument {
  private Oboe() {}

  public static Oboe create() {
    return new Oboe();
  }

  public String play() {
    return "glorious sound";
  }
}
