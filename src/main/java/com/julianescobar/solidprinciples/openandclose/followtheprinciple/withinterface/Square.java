package com.julianescobar.solidprinciples.openandclose.followtheprinciple.withinterface;

public class Square {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double calculateArea() {
    return side * side;
  }
}
