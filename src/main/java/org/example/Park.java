package org.example;

public class Park {

    public class Attraction {

        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название: " + name);
            System.out.println("Рабочие часы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }
}