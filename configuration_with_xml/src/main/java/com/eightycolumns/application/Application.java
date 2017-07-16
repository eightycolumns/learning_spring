package com.eightycolumns.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
      "application.xml"
    );

    String instr;

    InstrumentMaker oboeMaker = ac.getBean("oboeMaker", OboeMaker.class);
    Instrument oboe = ac.getBean("oboe", Oboe.class);

    InstrumentMaker pianoMaker = ac.getBean("pianoMaker", PianoMaker.class);
    Instrument piano = ac.getBean("piano", Piano.class);

    instr = oboeMaker.makeInstrument().getClass().getSimpleName();
    instr = instr.substring(0, 1).toLowerCase() + instr.substring(1);
    System.out.println("The oboe-maker makes an " + instr + ".");
    System.out.println("Behold the " + oboe.play() + " of the " + instr + "!");

    instr = pianoMaker.makeInstrument().getClass().getSimpleName();
    instr = instr.substring(0, 1).toLowerCase() + instr.substring(1);
    System.out.println("The piano-maker makes a " + instr + ".");
    System.out.println("Behold the " + piano.play() + " of the " + instr + "!");
  }
}
