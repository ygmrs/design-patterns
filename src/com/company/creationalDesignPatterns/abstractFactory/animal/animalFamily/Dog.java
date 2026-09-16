package com.company.abstractFactory.animal.animalFamily;

public class Dog implements Animal{

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Wohw";
    }
}
