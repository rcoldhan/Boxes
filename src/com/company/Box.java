package com.company;

/**
 * у класса Box<T> должны быть только 2 метода:
 * put и get для возможности положить/достать объект Т из/в коробку.
 */

public class Box<T> {
    private T element;

    public T get() {
        return element;
    }

    public void put(final T element) {
        this.element = element;
    }
}