package com.julianescobar.solidprinciples.interfacesegregation.followtheprinciple;

public class Printer implements Startable{
  @Override
  public void start() {
    System.out.println("Printer is starting");
  }
}
