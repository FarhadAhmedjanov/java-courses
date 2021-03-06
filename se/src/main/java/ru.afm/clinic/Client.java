package ru.afm.clinic;

public class Client {
    private final String id;
    private final Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }

    public String getPetName(){
        return this.pet.getName();
    }

    public String getId() {
        return id;
    }
}
