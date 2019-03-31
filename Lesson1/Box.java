package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<Type extends Fruit> {

    ArrayList<Type> arrayList;

    public Box() {
        arrayList = new ArrayList<Type>();
    }

    public void add(Type element) {
       arrayList.add(element);
    }


    // возвращаем вес
    public int getWeight() {
        int value = arrayList.size() * arrayList.get(0).getWeight();
        return value;
    }

    //сравниваем вес
    public boolean compare(Box<?> Box) {
    int firstBox = this.getWeight();
    int secondBox = Box.getWeight();
        if (firstBox == secondBox) {
            return true;
        } else {
            return false;
        }
    }

    // объединяем коробки
    public void union (Box<Type> Box) {
        for (int i = 0; i < arrayList.size() ; i++) {
            Box.add(arrayList.get(i));
        }
        arrayList.clear();
    }
}
