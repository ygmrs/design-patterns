package com.company.abstractFactory.animal;

import com.company.abstractFactory.animal.colorFamily.Black;
import com.company.abstractFactory.animal.colorFamily.Brown;
import com.company.abstractFactory.animal.colorFamily.Color;
import com.company.abstractFactory.animal.colorFamily.White;

public class ColorFactory implements AbstractFactory<Color>{

    @Override
    public Color create(String type) {
        if("Black".equalsIgnoreCase(type)){
            return new Black();
        }else if("Brown".equalsIgnoreCase(type)){
            return new Brown();
        }else if("White".equalsIgnoreCase(type)){
            return new White();
        }
        return null;
    }
}
