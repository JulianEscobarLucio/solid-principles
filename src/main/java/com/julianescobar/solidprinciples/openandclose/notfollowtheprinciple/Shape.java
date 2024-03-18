package com.julianescobar.solidprinciples.openandclose.notfollowtheprinciple;

public class Shape {

  public float calculateArea(Shape shape) {
    if (shape instanceof Circle) {
        return (float) (Math.PI * Math.pow(((Circle) shape).getRadius(), 2));
    } else if (shape instanceof Square) {
      return ((Square) shape).getSide() * ((Square) shape).getSide();
    } else if (shape instanceof Triangle) {
      return (((Triangle) shape).getBase() * ((Triangle) shape).getHeight()) / 2;
    } else {
      return 0;
    }
  }
}
