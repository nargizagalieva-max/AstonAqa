package org.example;

public class Main {

    public static void main(String[] args) {

        Bowl bowl = new Bowl(20);

        Cat[] cats = {
                new Cat("Блэки"),
                new Cat("Джейк"),
                new Cat("Пуся")
        };

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println();
        for (Cat cat : cats) {
            System.out.println(cat.name + " — " +
                    (cat.isFull() ? "сыт" : "голоден"));
        }

        System.out.println();
        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.catCount);
        shapesDemo();

    }
    private static void shapesDemo() {
        Shape circle = new Circle(5.0, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
        Shape triangle = new Triangle(3.0, 4.0, 5.0, "Зелёный", "Жёлтый");

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println("----------------------");
        }
    }
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
