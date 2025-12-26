package org.example;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ===== ДЗ: ИСКЛЮЧЕНИЯ =====
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }

        // ===== ДЗ: студенты =====
        System.out.println("----- ПРОВЕРКА ЗАДАНИЯ STUDENT -----");

        Set<Student> students = new HashSet<>();

        students.add(new Student("Наргиза", "A1", 1, List.of(5, 4, 4)));
        students.add(new Student("Коля", "A1", 1, List.of(2, 2, 3)));
        students.add(new Student("Степан", "B2", 2, List.of(3, 3, 4)));
        students.add(new Student("Ололо", "B2", 2, List.of(5, 5, 5)));

        removeBadStudents(students);
        promoteStudents(students);

        System.out.println("Студенты на 2 курсе:");
        printStudents(students, 2);

        System.out.println("Студенты на 3 курсе:");
        printStudents(students, 3);

        // ===== ДЗ: справочник =====
        System.out.println("----- ПРОВЕРКА ТЕЛЕФОННОГО СПРАВОЧНИКА -----");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ололоев", "123-45-67");
        phoneBook.add("Иванов", "999-88-77");
        phoneBook.add("Петров", "555-66-77");

        System.out.println("Ололоев: " + phoneBook.get("Ололоев"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Огогоев: " + phoneBook.get("Огогоев"));
    }

    // ===== ИСКЛЮЧЕНИЯ =====
    public static int sumArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4");
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ошибка в ячейке [" + i + "][" + j + "]"
                    );
                }
            }
        }
        return sum;
    }

    // ===== STUDENT =====
    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
