package com.patterns.behavioral.iterator;

public interface Iterator<E> {
    E current();

    E next();

    void reset();

    boolean hasNext();


}
