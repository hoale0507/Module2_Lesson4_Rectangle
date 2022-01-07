package com.company;

public class Rectangle {
    private double width;
    private double height;
    Rectangle(){
    }
    Rectangle(double width1, double height1){
        width = width1;
        height = height1;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width + height);
    }
    public String display(){
        return "The width is " + width + ", the height is " + height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area =" + this.getArea() +
                ", perimeter =" + this.getPerimeter() +
                '}';
    }
}
