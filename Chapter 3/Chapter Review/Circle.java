/**
 * Write a program that has two classes as described below:
 *  a) The Circle class that has:
 *      i. a class constant named PI whose value is 3.142
 *      ii. an instance variable named radius
 *      iii. a constructor that creates a Circle object with a given radius
 *      iv. a method that returns the area of the circle (PI*radius^2)
 *      v. a method that returns the circumference of the circle (2 * pi * radius)
 *
 *
 *  b) The UsingCircle class that has a main method that includes instructions to:
 *      i. create a circle object with a radius 4.5
 *      ii. print the area of the circle in the form (area is <returned value>)
 *      iii. print the circumference of the circle on a new line in the form (circumference is <returned value>)
 *
 * @author hawyarfarooq
 */

public class Circle {

    // pi value, final because it will not change
    final double PI = 3.142;

    // radius of the circle
    double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // returns the area of the circle
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    // returns the circumference of the circle
    public double circumference() {
        return 2 * PI * radius;
    }

    // UsingCircle class to create a new circle and print the result
    public static class UsingCircle {

        // The main method to test and display the results
        public static void main(String[] args) {

            // change the number (radius) passed into the circle instance
            Circle circle = new Circle(4.5);
            System.out.println("area is " + circle.area());
            System.out.println("circumference is " + circle.circumference());

        }
    }
}