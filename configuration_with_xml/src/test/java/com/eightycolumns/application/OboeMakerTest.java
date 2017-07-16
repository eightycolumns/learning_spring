package com.eightycolumns.application;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class OboeMakerTest {
  private InstrumentMaker oboeMaker;

  @Before
  public void setUp() {
    oboeMaker = OboeMaker.create();
  }

  @Test
  public void oboeMakerMakesOboes() {
    assertThat(oboeMaker.makeInstrument(), instanceOf(Oboe.class));
  }
}
