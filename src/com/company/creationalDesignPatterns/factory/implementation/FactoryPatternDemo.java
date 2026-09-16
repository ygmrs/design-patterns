package com.company.factory.implementation;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        //get an object of Rectangle and call its draw method
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();

        //get an object of Rectangle and call its draw method
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
    }
}
