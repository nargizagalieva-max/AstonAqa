package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumBetween10And20(10, 20));
        printPosOrNeg(6);
        System.out.println(isLessThanZero(10));
        printString("ujas kak trudno!", 5);
        System.out.println(isLeapYear(1996));
        invertArray();
        fillArray();
        doubleSmallNumbers();
        fillBothDiagonals();
        int[] myArray = createArray(10, 7);
        System.out.println(Arrays.toString(myArray));
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
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    private static void printColor() {
        int value = 51;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
     в противном случае “a < b”;
     */
    private static void compareNumbers() {
        int a = 13;
        int b = 17;
        if (a >= 0) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /*5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    private static void printPosOrNeg(int num) {
        if (num >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /* 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
     */
    private static boolean isLessThanZero(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }

    }

    /* 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
    в консоль указанную строку, указанное количество раз;
     */
    private static void printString(String text, int count) {
        for (int au = 0; au < count; au++) {
            System.out.println(text);
        }
    }

    /* 9. Напишите метод, который определяет, является ли год високосным,
     и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
      кроме каждого 100-го, при этом каждый 400-й – високосный
     */
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*10. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
     его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    private static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }


    /*2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void doubleSmallNumbers() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

    /* 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     то есть [0][0], [1][1], [2][2], ..., [n][n];
     */
    static void fillBothDiagonals() {
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }

        System.out.println("Матрица с двумя диагоналями из единиц:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

     /* 14. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
      */

    static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}