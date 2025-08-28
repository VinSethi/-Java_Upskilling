package com.sparta.nam.OOP;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }
}

