package com.company;

public class Rectangle {
    private double Height;
    private double Width;

    public void setHeight(double height) {
        Height = height;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public double getWidth() {
        return Width;
    }

    public Rectangle(double height, double width) {
        Height = height;
        Width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Height=" + Height +
                ", Width=" + Width +
                '}';
    }
    public double calculate_area(){
        return Height*Width;

    }
}
