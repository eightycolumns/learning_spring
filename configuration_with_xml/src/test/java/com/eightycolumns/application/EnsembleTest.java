package com.eightycolumns.application;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class EnsembleTest {
  private Musician oboist;
  private Musician pianist;
  private Ensemble ensemble;

  @Before
  public void setUp() {
    oboist = new Musician(Oboe.create());
    pianist = new Musician(Piano.create());
    Set<Musician> musicians = new HashSet<>();
    musicians.add(oboist);
    musicians.add(pianist);
    ensemble = new Ensemble(musicians);
  }

  @Test
  public void ensembleHasTwoMusicians() {
    assertThat(ensemble.musicians(), hasSize(2));
  }

  @Test
  public void ensembleHasOboist() {
    assertThat(ensemble.musicians(), hasItem(oboist));
  }

  @Test
  public void ensembleHasPianist() {
    assertThat(ensemble.musicians(), hasItem(pianist));
  }
}
