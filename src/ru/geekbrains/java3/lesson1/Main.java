package ru.geekbrains.java3.lesson1;

import ru.geekbrains.java3.lesson1.Fruit.Apple;
import ru.geekbrains.java3.lesson1.Fruit.Box;
import ru.geekbrains.java3.lesson1.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(replaysArrElPos(1, 2, new Object[]{"a", 1, "c"}));

        System.out.println(arrInAL(new Object[]{1, 2, 3}));

        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println(box1.getWeight());

        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box3.addFruit(new Orange());

        System.out.println(box2.getWeight() + "   " + box3.getWeight());
        box2.shiftFruit(box3);
        System.out.println(box2.getWeight() + "   " + box3.getWeight());
    }

    public static <T> String replaysArrElPos(int a1, int a2, T... arr) {
        T t = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = t;
        return Arrays.toString(arr);
    }

    public static <T> ArrayList arrInAL(T... arr) {
        return new ArrayList(Arrays.asList(arr));
    }
}
