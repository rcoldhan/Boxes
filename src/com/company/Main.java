package com.company;

public class Main {

    public static void main(final String[] args) {

        //copyFromBoxToBox
        Box<Integer> box = new Box<>();
        box.put(1);
        Box<Integer> secondBox = new Box<>();
        BoxUtil.copyFromBoxToBox(box, secondBox);

        //copyFreshFruitFromBoxToBox
        //Apple freshApple = new Apple("Свежее яблоко");
        //freshApple.setFresh(true);
        Apple notFreshApple = new Apple("несвежее яблоко");
        notFreshApple.setFresh(false);
        Box<Apple> appleBox = new Box<>();
        appleBox.put(notFreshApple);
        //appleBox.put(freshApple);
        //appleBox.put(null);
        Box<Fruit> fruitBox = new Box<>();
        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);

        //printElementFromTwoBoxes
        Box<Integer> box = new Box<>();
        box.put(2);
        Box<Box<Integer>> boxWithBox = new Box<>();
        boxWithBox.put(box);
        BoxUtil.printElementFromTwoBoxes(boxWithBox);

        //printElementFromBoxes
        Box<Integer> box = new Box<>();
        box.put(2);
        Box<Box<Integer>> boxWithBox = new Box<>();
        boxWithBox.put(box);
        Box<Box<Box<Integer>>> boxWithTwoBoxes = new Box<>();
        boxWithTwoBoxes.put(boxWithBox);
        Box<Box<Box<Integer>>> boxWithBoxAndNull = new Box<>();
        boxWithBoxAndNull.put(boxWithBox);
        BoxUtil.printElementFromBoxes(boxWithTwoBoxes);
        BoxUtil.printElementFromBoxes(boxWithBox);
        BoxUtil.printElementFromBoxes(box);
        BoxUtil.printElementFromBoxes(boxWithBoxAndNull);
    }
}