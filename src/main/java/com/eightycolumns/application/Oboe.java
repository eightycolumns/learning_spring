package com.eightycolumns.application;

public class Oboe implements Instrument {
  private static final String NAME = "oboe";

  public String name() {
    return NAME;
  }

  public void play() {
    System.out.println("Behold the glorious sound of the oboe!");
  }
}
