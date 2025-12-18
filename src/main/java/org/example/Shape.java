package org.example;
public interface Shape {

    double area();
    double perimeter();

    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.println(
                "Периметр: " + perimeter() +
                        ", Площадь: " + area() +
                        ", Цвет заливки: " + getFillColor() +
                        ", Цвет границы: " + getBorderColor()
        );
    }
}

