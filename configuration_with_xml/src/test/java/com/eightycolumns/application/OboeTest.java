package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {
  private Instrument oboe;

  @Before
  public void setUp() {
    oboe = Oboe.create();
  }

  @Test
  public void oboeMakesGloriousSound() {
    assertEquals("glorious sound", oboe.play());
  }
}
