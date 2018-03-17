package ru.afm.Clinic;

public class ClinicRunner {
    public static void main(String[] args) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Jon", new Dog(new Animal("Boby"))));
        clinic.addClient(1, new Client("Doroty", new Cat("Bars")));

        clinic.addClient(
                2, new Client("Ann",
                        new CatDog(new Cat("Tom"), new Dog("Piccy"))
                )
        );

    }
}
