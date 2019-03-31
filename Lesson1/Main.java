package Lesson1;/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Большая задача:
Есть классы Lesson1.Fruit -> Lesson1.Apple, Lesson1.Orange (больше фруктов не надо);
Класс Lesson1.Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта (вес яблока – 1.0f,
апельсина – 1.5f. Не важно, в каких это единицах); Внутри класса Коробка сделать метод compare, который позволяет сравнить
текущую коробку с той, которую подадут в compare в качестве параметра, true – если она равны по весу, false – в противном
случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами); Написать метод, который позволяет пересыпать фрукты
 из текущей коробки в другую (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в
 текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
Не забываем про метод добавления фрукта в коробку.
*/



import java.util.*;

public class Main {

      // меняем местами элементы массива
    public static <E> E[] change(E[] array, int el1, int el2) {
        E element;
        element = array[el1];
        array[el1] = array[el2];
        array[el2] = element;
        return array;
    }

// конвертация массива в ArrayList
    public static <E> ArrayList<E> toArrayList(E[] array) {
        ArrayList<E> arrayList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }



    public static <E> void arrayPrint(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



    public static void main(String[] args) {
        Integer[] array = {4,5,6};
        arrayPrint(array);

        System.out.println(" ");

        change(array, 0, 2);
        arrayPrint(array);

        System.out.println(" ");

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            orangeBox.add(new Orange());
        }
        System.out.println("Короб с апельсинами весит " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }
        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox1.add(new Apple());
        }
        System.out.println("Короб с яблоками # 1 весит " + appleBox.getWeight());
        System.out.println("Короб с яблоками # 2 весит " + appleBox1.getWeight());
        System.out.println("Результат сравнения веса коробов : " + orangeBox.compare(appleBox1));

        appleBox.union(appleBox1);
        System.out.println("Вес объединенных коробов составляет " + appleBox1.getWeight());
    }



}


