package Lesson1;

import Lesson1.Fruit;

public class Orange implements Fruit {
    int weight;
    String name;

    public Orange() {
        name = "Orange";
        weight = 2;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
