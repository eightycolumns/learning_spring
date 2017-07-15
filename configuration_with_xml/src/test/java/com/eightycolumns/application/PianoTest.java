package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
  private Instrument piano;

  @Before
  public void setUp() {
    piano = new Piano();
  }

  @Test
  public void pianoMakesGloriousSound() {
    Instrument piano = new Piano();
    assertEquals("glorious sound", piano.play());
  }
}
