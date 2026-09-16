package com.company.abstractFactory.animal.animalFamily;

public class Bear implements Animal{

    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Wiynk";
    }
}
