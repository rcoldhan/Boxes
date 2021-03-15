package com.company;

public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T obj = src.get();
        dest.put(obj);
        System.out.println(dest.get());
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super Fruit> dest) {
        T obj = src.get();
        if (obj != null && obj.isFresh()) {
            dest.put(obj);
            System.out.println(dest.get() + " в коробке!");
        } else {
            if (obj != null) {
                System.out.println("Нельзя положить в коробку несвежий фрукт..");
            } else {
                System.out.println("Коробка пуста! Перекладывать нечего..");
            }
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        T obj = box.get().get();
        System.out.println(obj);
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
    }
}