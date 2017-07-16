package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
  private Instrument piano;

  @Before
  public void setUp() {
    piano = Piano.create();
  }

  @Test
  public void pianoMakesGloriousSound() {
    assertEquals("glorious sound", piano.play());
  }
}
