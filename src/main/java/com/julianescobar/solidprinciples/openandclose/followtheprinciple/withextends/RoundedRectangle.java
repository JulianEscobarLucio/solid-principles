package com.julianescobar.solidprinciples.openandclose.followtheprinciple.withextends;

public class RoundedRectangle extends Rectangle{

  private double cornerRadius;

  public RoundedRectangle(double width, double height, double cornerRadius) {
    super(width, height);
    this.cornerRadius = cornerRadius;
  }

  @Override
  public double calculateArea() {
    double area = super.calculateArea();

    double roundedCornerArea = 4 * (Math.PI * Math.pow(cornerRadius, 2) - cornerRadius * cornerRadius);
    area -= roundedCornerArea;

    return area;
  }
}
