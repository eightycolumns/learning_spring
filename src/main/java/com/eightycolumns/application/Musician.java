package com.eightycolumns.application;

import org.springframework.beans.factory.annotation.Autowired;

public class Musician {
  private Instrument instrument;

  public Musician() {}

  public Musician(Instrument instrument) {
    this.instrument = instrument;
  }

  @Autowired
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public Instrument instrument() {
    return instrument;
  }
}
