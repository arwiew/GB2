package Lesson1;

public class Apple implements Fruit {

String name;
int weight;

public Apple() {
    name = "Apple";
    weight = 1;
}

    @Override
    public int getWeight() {
        return weight;
    }
}
