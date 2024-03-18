package com.julianescobar.solidprinciples.openandclose.followtheprinciple.withextends;

public class Rectangle {

  protected double width;
  protected double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height;
  }
}
