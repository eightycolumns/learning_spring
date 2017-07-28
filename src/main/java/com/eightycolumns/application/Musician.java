package com.eightycolumns.application;

import org.springframework.beans.factory.annotation.Autowired;

public class Musician {
  private Instrument instrument;

  public Musician() {}

  @Autowired
  public Musician(Instrument instrument) {
    this.instrument = instrument;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public Instrument instrument() {
    return instrument;
  }
}
