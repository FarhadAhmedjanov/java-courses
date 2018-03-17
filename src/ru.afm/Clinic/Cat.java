package ru.afm.Clinic;

public class Cat implements Pet {
    private final Animal animal;

    public Cat(Animal animal) {
        super();
        this.animal = animal;
    }

    public Cat(String name){
        super();
        this.animal = new Animal(name);
    }

    @Override
    public String getName() {
        return this.animal.getName();
    }
}
