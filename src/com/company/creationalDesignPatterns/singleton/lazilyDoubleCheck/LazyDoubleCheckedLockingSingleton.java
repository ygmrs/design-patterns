package com.company.singleton.lazilyDoubleCheck;

public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton instance;

    /** Lazily initialize the singleton in a synchronized block */
    private LazyDoubleCheckedLockingSingleton(){

    }

    /** Lazily initialize the singleton in a synchronized block */
    public static LazyDoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheckedLockingSingleton.class){
                // double check
                if(instance==null){
                    instance = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
