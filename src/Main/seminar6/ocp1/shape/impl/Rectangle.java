package Main.seminar6.ocp1.shape.impl;

import Main.seminar6.ocp1.shape.Shape;

public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
