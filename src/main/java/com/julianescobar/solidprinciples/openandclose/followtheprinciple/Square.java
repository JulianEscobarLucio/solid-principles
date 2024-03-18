package com.julianescobar.solidprinciples.openandclose.followtheprinciple;

public class Square extends Shape {

  private float side;

  public Square(float side) {
    this.side = side;
  }

  public float getSide() {
    return side;
  }

  @Override
  public float calculateArea(Shape shape) {
    Square square = (Square) shape;
    return square.getSide() * square.getSide();
  }
}
