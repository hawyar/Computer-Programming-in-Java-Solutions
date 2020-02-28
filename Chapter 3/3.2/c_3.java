package chapter3;

/**
 * Write a program that asks the user in the main method
 * to enter the weight of a person in kilograms and
 *  then call a method to return this weight in pounds
 * (1 kg = 2.20462 pounds)
 *
 * Sample output => Weight in kilogram is 65
 *                  Weight in pounds is 143.3003
 *
 * @author Hawyar Farooq
 */

import java.util.Scanner;

public class c_3 {

    public static void main(String[] args) {

        System.out.println("Enter weight in kilograms");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();

        System.out.println("Weight in kilograms is " +  convertToPounds(userInput));

    }

    public static double convertToPounds(int weight) {

        double toPounds = 2.20462;
        double result = weight * toPounds;

        return result;
    }
}
