package com.sda;

public class Circle {

        // attribute

    private double radius;

        //constructors

        public Circle(){}

        public Circle(double radius){
            this.radius = radius;
        }

        //setter

        public void setRadius(double radius){
            this.radius = radius;
        }

        //getter

        public void getRadius(double radius){
            this.radius = radius;
    }

        //methods for calculating

        public double Area(double radius){
            double area = Math.PI * Math.pow(radius, 2);
            area = Math.round((area * 100.0)) / 100.0;
            return area;

        }

        public double Perimeter (double radius){
            double perimeter = Math.PI * (2 * radius);
            perimeter = Math.round((perimeter * 100.0)) / 100.0;
            return perimeter;
        }

}