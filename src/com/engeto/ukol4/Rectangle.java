package com.engeto.ukol4;

public class Rectangle {
    private String rectangleName;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String rectangleName) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.rectangleName = rectangleName;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public String getRectangleName() {
        return rectangleName;
    }

    public void setRectangleName(String rectangleName) {
        this.rectangleName = rectangleName;
    }

    public double countArea(double a, double b){
        return a*b;
    }

    public double countPerimeter(double a, double b){
        return 2*(a+b);
    }
}
