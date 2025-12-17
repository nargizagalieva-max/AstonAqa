package org.example;

/* 1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена,
состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.*/

public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    double price;
    boolean booked;

    public Product(String name,
                   String productionDate,
                   String manufacturer,
                   String country,
                   double price,
                   boolean booked) {

        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booked = booked; }



    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Бронирован: " + booked);
    }


}
