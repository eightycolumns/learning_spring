package com.eightycolumns.application;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

  public void init() {
    System.out.println(
      "Initializing musician with instrument " + instrument.name() + "..."
    );
  }

  public void destroy() {
    System.out.println(
      "Destroying musician with instrument " + instrument.name() + "..."
    );
  }
}
