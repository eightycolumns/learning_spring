package com.eightycolumns.application;

public class PianoMaker implements InstrumentMaker {
  private PianoMaker() {}

  public static PianoMaker create() {
    return new PianoMaker();
  }

  public Piano makeInstrument() {
    return Piano.create();
  }
}
