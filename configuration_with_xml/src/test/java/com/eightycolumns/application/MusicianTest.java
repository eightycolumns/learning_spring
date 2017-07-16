package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicianTest {
  private Musician oboist;
  private Musician pianist;

  @Before
  public void setUp() {
    oboist = new Musician(Oboe.create());
    pianist = new Musician(Piano.create());
  }

  @Test
  public void oboistMakesGloriousSound() {
    assertEquals("glorious sound", oboist.play());
  }

  @Test
  public void pianistMakesGloriousSound() {
    assertEquals("glorious sound", pianist.play());
  }
}
