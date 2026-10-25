package Com.example.Challenge_27.Util;

import Com.example.Challenge_27.geometry.geometry;

public class Calculator {
    public static void main(String[] args) {
        geometry circle = new geometry(2);
        System.out.println(circle.getAreaOfCircle());
        geometry rect = new geometry(2,2);
        System.out.println(rect.getAreaOfRectangle());
    }

}
