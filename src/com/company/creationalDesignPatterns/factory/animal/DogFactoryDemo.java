package com.company.factory.animal;

public class DogFactoryDemo {

    public static void main(String[] args) {

        // create a small dog
        Dog smallDog = DogFactory.getDog("small");
        smallDog.speak();

        // create a small dog
        Dog bigDog = DogFactory.getDog("big");
        bigDog.speak();

        // create a small dog
        Dog workingDog = DogFactory.getDog("working");
        workingDog.speak();

    }
}
