package org.example;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean eat(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("В миску добавили " + amount + " еды. Теперь еды: " + food);
    }

    public int getFood() {
        return food;
    }
}


