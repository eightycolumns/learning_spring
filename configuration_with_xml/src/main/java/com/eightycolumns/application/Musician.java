package com.eightycolumns.application;

public class Musician {
  private Instrument instrument;

  public Musician(Instrument instrument) {
    this.instrument = instrument;
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
