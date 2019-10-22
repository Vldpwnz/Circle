package com.sda;
import java.util.*;
public class CircleTestDrive {
    public static void main (String [] args) {
        Scanner rad = new Scanner (System.in);
        System.out.print("Enter radius to compute perimeter  and area : ");
        double input = rad.nextDouble();
        Circle a = new Circle();
        System.out.println("This is the perimeter: " + a.Perimeter(input) +  "\n" + "This is the area: " + a.Area(input));

    }
}
