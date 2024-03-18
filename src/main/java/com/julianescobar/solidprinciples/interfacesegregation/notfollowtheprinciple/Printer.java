package com.julianescobar.solidprinciples.interfacesegregation.notfollowtheprinciple;

public class Printer implements Machine {
  @Override
  public void start() {
    System.out.println("Printer is starting");
  }

  @Override
  public void stop() {
    //Método stop no es relevante para la impresora
  }
}
