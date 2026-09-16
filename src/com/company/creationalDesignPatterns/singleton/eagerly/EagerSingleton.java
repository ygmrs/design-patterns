package com.company.singleton.eagerly;

public class EagerSingleton {

    //private constructor to prevent others from instantiating this class
    private static EagerSingleton instance = new EagerSingleton();

    //Create an instance of the class at the time of class loading
    private EagerSingleton() {
    }

    //Provide a global point of access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

}
