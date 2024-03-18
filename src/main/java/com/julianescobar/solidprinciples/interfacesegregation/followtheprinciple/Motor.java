package com.julianescobar.solidprinciples.interfacesegregation.followtheprinciple;

public class Motor implements Startable, Stoppable{
  @Override
  public void start() {
    System.out.println("Motor is starting");
  }

  @Override
  public void stop() {
    System.out.println("Motor is stopping");
  }
}
