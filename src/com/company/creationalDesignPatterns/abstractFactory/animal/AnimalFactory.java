package com.company.abstractFactory.animal;

import com.company.abstractFactory.animal.animalFamily.Animal;
import com.company.abstractFactory.animal.animalFamily.Bear;
import com.company.abstractFactory.animal.animalFamily.Dog;
import com.company.abstractFactory.animal.animalFamily.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String type) {
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        }else if("Duck".equalsIgnoreCase(type)){
            return new Duck();
        }else if("Bear".equalsIgnoreCase(type)){
            return new Bear();
        }
        return null;
    }
}
