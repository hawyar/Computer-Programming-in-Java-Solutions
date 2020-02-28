package chapter3;

import java.util.Scanner;

/**
 * Write a Java program that asks for the length and the width of a rectangle
 * in the main method. The program then prints the area and perimeter of this
 * rectangle by calling two different methods from the main method. Your program must
 * properly use the three different types of comments to explain the program
 *
 * @author hawyarfarooq
 */
public class c_2 {
    /*
    * The main method asks the user for the length and width
    * then returns the area and perimeter by calling the two methods
    */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // asks for length
        System.out.println("Enter length of the rectangle");
        int rectLength = s.nextInt();

        // asks for width
        System.out.println("Enter width of the rectangle");
        int rectWidth = s.nextInt();

        //prints the area
        System.out.println("Area of the rectangle is " + calcArea(rectLength, rectWidth));

        //prints the perimeter
        System.out.println("Perimeter of the rectangle is " + calcPerimeter(rectLength, rectWidth));
    }

    /**
     * @param length of the rectangle
     * @param width of the rectangle
     * @return the area of the rectangle
     */
    public static int calcArea(int length, int width) {
        int area = length * width;
        return area;
    }

    /**
     * @param length of the rectangle
     * @param width of the rectangle
     * @return the perimeter of the rectangle
     */
    public static int calcPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        return perimeter;
    }
}
