package com.company.abstractFactory.animal;

public interface AbstractFactory<T> {

    T create(String type);
}
