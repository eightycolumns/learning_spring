package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {
  private Instrument oboe;

  @Before
  public void setUp() {
    oboe = new Oboe();
  }

  @Test
  public void oboeMakesGloriousSound() {
    Instrument oboe = new Oboe();
    assertEquals("glorious sound", oboe.play());
  }
}
