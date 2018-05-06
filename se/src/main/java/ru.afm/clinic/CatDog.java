package ru.afm.clinic;

public class CatDog implements Pet {
    private final Pet cat;
    private final Dog dog;

    public CatDog(Pet cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public String getName(){
        return String.format("%s%s", cat.getName(), dog.getName());
    }
}
