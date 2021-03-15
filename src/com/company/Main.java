package com.company;

public class Main {

    public static void main(final String[] args) {

        //copyFromBoxToBox
        Box<Integer> box = new Box<>();
        box.put(1);
        Box<Integer> secondBox = new Box<>();
        BoxUtil.copyFromBoxToBox(box, secondBox);

        //copyFreshFruitFromBoxToBox
        //Apple freshApple = new Apple("Свежее яблоко", true);
        Apple notFreshApple = new Apple(false);
        Box<Apple> appleBox = new Box<>();
        appleBox.put(notFreshApple);
        //appleBox.put(freshApple);
        //appleBox.put(null);
        Box<Fruit> fruitBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);

        //printElementFromTwoBoxes
        box.put(2);
        Box<Box<Integer>> boxWithBox = new Box<>();
        BoxUtil.printElementFromTwoBoxes(boxWithBox);

        //printElementFromBoxes

    }
}