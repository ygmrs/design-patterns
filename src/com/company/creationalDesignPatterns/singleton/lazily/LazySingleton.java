package com.company.singleton.lazily;

public class LazySingleton {

    private static LazySingleton instance;

    /** Don't let anyone else instantiate this class */
    private LazySingleton(){

    }

    /** Lazily create the instance when it is accessed for the first time */
    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
