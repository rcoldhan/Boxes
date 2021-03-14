package com.company;

/**
 * Создать класс Fruit c полем boolean fresh = true и геттером/сеттером для него
 */

public class Fruit {
    private boolean fresh = true;

    public final boolean isFresh() {
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }
}