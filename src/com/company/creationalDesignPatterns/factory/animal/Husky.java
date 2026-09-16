package com.company.factory.animal;

public class Husky implements Dog{

    @Override
    public void speak() {
        System.out.println("The husky says \"Dude, what's up?\"");
    }
}
