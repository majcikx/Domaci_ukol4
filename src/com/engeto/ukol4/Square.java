package com.engeto.ukol4;

public class Square {
    private String squareName;
    private double sideA;

    public Square(double sideA,String squareName) {
        this.sideA = sideA;
        this.squareName = squareName;
    }

    public String getSquareName() {
        return squareName;
    }

    public void setSquareName(String squareName) {
        this.squareName = squareName;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double countPerimeter(double a){
        return 4*a;
    }

    public double countArea(double a){
        return Math.pow(a,2);
    }
}
