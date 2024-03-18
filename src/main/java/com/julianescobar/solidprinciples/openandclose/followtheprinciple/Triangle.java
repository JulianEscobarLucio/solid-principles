package com.julianescobar.solidprinciples.openandclose.followtheprinciple;

public class Triangle extends Shape {

  private float base;
  private float height;

  public Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  public float getBase() {
    return base;
  }

  public float getHeight() {
    return height;
  }

  @Override
  public float calculateArea(Shape shape) {
    Triangle triangle = (Triangle) shape;
    return (triangle.getBase() * triangle.getHeight()) / 2;
  }
}
