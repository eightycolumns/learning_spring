package com.eightycolumns.application;

public class Musician {
  private Instrument instrument;

  public Musician(Instrument instrument) {
    this.instrument = instrument;
  }

  public String play() {
    return instrument.play();
  }

  public String instrumentName() {
    return instrument.name();
  }
}
