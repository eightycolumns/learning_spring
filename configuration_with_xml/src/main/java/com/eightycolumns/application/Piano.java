package com.eightycolumns.application;

public class Piano implements Instrument {
  private Piano() {}

  public static Piano create() {
    return new Piano();
  }

  public String play() {
    return "glorious sound";
  }
}
