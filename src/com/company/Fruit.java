package com.company;

public class Fruit {
    private String name = null;
    private boolean fresh;

    public Fruit(final String name, final boolean fresh) {
        this.name = name;
        this.fresh = fresh;
    }

    public Fruit(final boolean fresh) {
        this.fresh = fresh;
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