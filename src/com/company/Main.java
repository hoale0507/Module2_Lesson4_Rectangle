package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();
        rect1.setWidth(width);
        rect1.setHeight(height);
        System.out.println("Your rectangle \n" + rect1.display());
        System.out.println("The area is: \n" + rect1.getArea());
        System.out.println("The perimeter is: \n" + rect1.getPerimeter());
        System.out.println(rect1);
    }
}
