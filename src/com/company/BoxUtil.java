package com.company;

public class BoxUtil {
    /**
     * скопировать содержимое из одной коробки в другую.
     * Box(dest), в которую будем копировать, может быть типизирована
     * любым родителем объекта, содержащимся в Box(src)
     */

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T obj = src.get();
        dest.put(obj);
    }

    /**
     * скопировать содержимое из Box(src), которая может быть типизирована
     * только классом Fruit и его наследниками,
     * при условии, что содержащийся фрукт свежий (fresh == true).
     * Box(dest), в которую будем копировать, может быть типизирована
     * любым родителем объекта, содержащимся в Box(src)
     */

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T extends Fruit> src, final Box<T super Fruit> dest) {
        T obj = src.get();
        if (obj != null && obj.isFresh()) {
            dest.put(obj);
        }
    }

    /**
     * вывести в консоль (toString()) объект второй коробки
     */

    public static /*...*/ void printElementFromTwoBoxes(final Box</*...*/> box) {
        /*...*/
    }

    /**
     * вывести в консоль (toString()) объект последней коробки
     * box Box, которая содержит в себе любое кол-во вложенных Box,
     * в последней из которых может быть любой объект.
     */
    public static /*...*/ void printElementFromBoxes(final Box</*...*/> box) {
        /*...*/
    }
}