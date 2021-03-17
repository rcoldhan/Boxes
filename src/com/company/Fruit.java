package com.company;

public class Fruit {
    private final String name;
    private boolean fresh = true;

    public Fruit(final String name) {
        this.name = name;
    }

    @Override
    public final String toString() {
        return name;
    }

    public final boolean isFresh() {
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }
}