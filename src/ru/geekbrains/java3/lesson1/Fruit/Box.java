package ru.geekbrains.java3.lesson1.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public float getWeight() {
        float w = 0.0f;
        for (T t : box) {
            w += t.getWeight();

        }
        return w;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.000001;
    }

    public void shiftFruit(Box<? super T> another) {
        if (another == this) {
            return;
        }
        another.box.addAll(this.box);
        this.box.clear();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }
}
