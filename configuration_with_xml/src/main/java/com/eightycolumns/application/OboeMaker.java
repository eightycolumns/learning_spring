package com.eightycolumns.application;

public class OboeMaker implements InstrumentMaker {
  private OboeMaker() {}

  public static OboeMaker create() {
    return new OboeMaker();
  }

  public Oboe makeInstrument() {
    return Oboe.create();
  }
}
