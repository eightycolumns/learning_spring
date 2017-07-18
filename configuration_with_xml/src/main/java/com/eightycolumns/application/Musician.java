package com.eightycolumns.application;

public class Musician {
  private Instrument instrument;

  private Musician() {}

  private Musician(Instrument instrument) {
    this.instrument = instrument;
  }

  public static Musician create() {
    return new Musician();
  }

  public static Musician create(Instrument instrument) {
    return new Musician(instrument);
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
