package com.eightycolumns.application;

public class Musician {
  private Instrument instrument;

  private Musician(Instrument instrument) {
    this.instrument = instrument;
  }

  public static Musician create(Instrument instrument) {
    return new Musician(instrument);
  }

  public String play() {
    return instrument.play();
  }

  public String instrumentName() {
    return instrument.name();
  }
}
