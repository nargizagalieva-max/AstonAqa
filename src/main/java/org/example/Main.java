package org.example;

public class Main {

    public static void main(String[] args) {

        // 1. Миска с едой
        Bowl bowl = new Bowl(20);

        // 2. Массив котов
        Cat[] cats = {
                new Cat("Блэки"),
                new Cat("Джейк"),
                new Cat("Пуся")
        };

        // 3. Кормим котов
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        // 4. Проверяем сытость
        System.out.println();
        for (Cat cat : cats) {
            System.out.println(cat.name + " — " +
                    (cat.isFull() ? "сыт" : "голоден"));
        }

        // 5. Счётчики
        System.out.println();
        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.catCount);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
