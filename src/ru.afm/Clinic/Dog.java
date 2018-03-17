package ru.afm.Clinic;

public class Dog implements Pet {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    public Dog(String name){
        this.animal = new Animal(name);
    }

    @Override
    public String getName() {
        return this.animal.getName();
    }
}
