package com.company.singleton.eagerlyStaticBlock;

public class EagerStaticBlockSingleton {

    private static EagerStaticBlockSingleton instance;

    /** Don't let anyone else instantiate this class */
    private EagerStaticBlockSingleton(){

    }

    /** Create the one-and-only instance in a static block */
    static{
        try{
            instance = new EagerStaticBlockSingleton();
        }catch (Exception exp){
            exp.printStackTrace();
        }
    }

    /** Provide a public method to get the instance that we created */
    public static EagerStaticBlockSingleton getInstance(){
        return instance;
    }

}
