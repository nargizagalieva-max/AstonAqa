package org.example;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }

    /*
    1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple
     */
    private static void printThreeWords() {
        String text = "Orange \n" + "Banana \n" + "Apple \n";
        System.out.println(text);
    }

    /*
     2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
     которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль
     сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */
    private static void checkSumSign() {
        int a = 5;
        int b = -50;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else  { System.out.println("Сумма отрицательная");}

    }



}