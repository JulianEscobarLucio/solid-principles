package com.julianescobar.solidprinciples.openandclose.notfollowtheprinciple;

public class Square extends Shape{

  private float side;

  public Square(float side) {
    this.side = side;
  }

  public float getSide() {
    return side;
  }
}
