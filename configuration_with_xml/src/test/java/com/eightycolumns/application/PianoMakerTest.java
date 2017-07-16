package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class PianoMakerTest {
  private PianoMaker pianoMaker;

  @Before
  public void setUp() {
    pianoMaker = PianoMaker.create();
  }

  @Test
  public void pianoMakerMakesPianos() {
    assertThat(pianoMaker.makeInstrument(), instanceOf(Piano.class));
  }
}
