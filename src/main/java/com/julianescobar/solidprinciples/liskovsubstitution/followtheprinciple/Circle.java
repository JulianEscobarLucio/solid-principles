package com.julianescobar.solidprinciples.liskovsubstitution.followtheprinciple;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
