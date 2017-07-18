package com.eightycolumns.application;

import java.util.Set;

public class Ensemble {
  private Set<Musician> musicians;

  public Ensemble(Set<Musician> musicians) {
    this.musicians = musicians;
  }

  public Set<Musician> musicians() {
    return musicians;
  }
}
