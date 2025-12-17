package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product ("MacBook Air M4", "01.06.2025", "Apple Inc.", "USA", 8969, false);
        productsArray[2] = new Product("PlayStation 6", "05.05.2025", "Sony", "Japan", 4959, true);
        productsArray[3] = new Product("MacBook Air M3", "01.08.2023", "Apple Inc.", "USA", 6949, false);
        productsArray[4] = new Product("Samsung S23 Ultra", "02.05.2025", "Samsung Corp.", "Korea", 3595, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println("-----");
        }
        Park park = new Park();
        Park.Attraction attraction = park.new Attraction("Молоток", "09:00-22:00", 350.0);
        attraction.printInfo();
    }
}