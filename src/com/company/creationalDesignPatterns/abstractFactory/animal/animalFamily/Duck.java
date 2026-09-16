package com.company.abstractFactory.animal.animalFamily;

public class Duck implements Animal{

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
