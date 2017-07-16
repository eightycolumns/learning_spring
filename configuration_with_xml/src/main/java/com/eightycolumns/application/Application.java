package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    InstrumentMaker oboeMaker = ac.getBean("oboeMaker", OboeMaker.class);
    Musician oboist = ac.getBean("oboist", Musician.class);
    Instrument oboe = ac.getBean("oboe", Oboe.class);

    System.out.println(
      "The oboe-maker makes an " + oboeMaker.makeInstrument().name() + "."
    );

    System.out.println(
      "An oboist plays that " + oboist.instrumentName() + "."
    );

    System.out.println(
      "Behold the " + oboe.play() + " of the " + oboe.name() + "!"
    );

    InstrumentMaker pianoMaker = ac.getBean("pianoMaker", PianoMaker.class);
    Musician pianist = ac.getBean("pianist", Musician.class);
    Instrument piano = ac.getBean("piano", Piano.class);

    System.out.println(
      "The piano-maker makes a " + pianoMaker.makeInstrument().name() + "."
    );

    System.out.println(
      "A pianist plays that " + pianist.instrumentName() + "."
    );

    System.out.println(
      "Behold the " + piano.play() + " of the " + piano.name() + "!"
    );
  }
}
