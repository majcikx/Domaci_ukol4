package com.engeto.ukol4;

public class Circle {
    private String circleName;
    private double radius;

    public Circle(double radius,String circleName) {
        this.radius = radius;
        this.circleName = circleName;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double countPerimeter(double radius){
        return 2*Math.PI*radius;
    }

    public double countArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
}
