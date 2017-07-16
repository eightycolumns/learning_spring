package com.eightycolumns.application;

public class Musician {
  private Instrument instrument;

  private Musician() {}

  public static Musician create() {
    return new Musician();
  }

  public String instrumentName() {
    return instrument.name();
  }

  public String play() {
    return instrument.play();
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }
}
