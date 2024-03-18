package com.julianescobar.solidprinciples.openandclose.notfollowtheprinciple;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
      this.radius = radius;
    }

    public float getRadius() {
      return radius;
    }
}
