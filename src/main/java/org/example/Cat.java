package org.example;

public class Cat extends Animal {

    protected static int catCount;
    private boolean isFull;
    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (isFull) {
            System.out.println(name + " уже сыт.");
            return;
        }

        if (bowl.eat(amount)) {
            isFull = true;
            System.out.println(name + " поел и стал сыт.");
        } else {
            System.out.println(name + " не поел. В миске мало еды.");
        }
    }
    public boolean isFull() {
        return isFull;
    }
}




