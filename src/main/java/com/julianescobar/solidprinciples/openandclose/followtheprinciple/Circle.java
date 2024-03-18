package com.julianescobar.solidprinciples.openandclose.followtheprinciple;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
      this.radius = radius;
    }

    public float getRadius() {
      return radius;
    }

    @Override
    public float calculateArea(Shape shape) {
      Circle circle = (Circle) shape;
      return (float) (Math.PI * Math.pow(circle.getRadius(), 2));
    }
}
