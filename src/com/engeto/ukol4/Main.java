package com.engeto.ukol4;

public class Main {

    public static void main(String[] args) {
        String shape;
        String result = "";
        Rectangle rectangle1 = new Rectangle(5, 4, "obdelnik");
        Square square1 = new Square(8, "ctverec");
        Triangle triangle1 = new Triangle(4, 5, 6, "trojuhelnik");
        Circle circle1 = new Circle(9, "kruh");

        shape = rectangle1.getRectangleName();
        switch (shape) {
            case "obdelnik": result = "Obvod obdelniku je " + rectangle1.countPerimeter(rectangle1.getSideA(), rectangle1.getSideB())
                                     +"Obsah obdelniku je " + rectangle1.countArea(rectangle1.getSideA(), rectangle1.getSideB());
            case "ctverec" : result = "Obvod ctverce je " + square1.countPerimeter(square1.getSideA()) + "Obsah ctverce je " + square1.countArea(square1.getSideA());
            case "trojuhelnik": result = "Obvod trojuhelniku je " + triangle1.countPerimeter(triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC()) +
                                        "Obsah trojuhelniku je " + triangle1.countArea(triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC());
            case "kruh": result = "Obvod kruhu je " + circle1.countPerimeter(circle1.getRadius()) + "Obsah kruhu je " + circle1.countArea(circle1.getRadius());

        }
        System.out.println(result);


    }

  }

