package ru.afm.clinic;

public class Animal implements Pet {
    private final String name;

    public Animal(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
