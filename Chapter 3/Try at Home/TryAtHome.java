/**
 * Write a program that has one class Named Name that includes:
 * 1. Two instance variables firstName and lastName and a default constructor to set the variables to null
 * 2. A constructor with two parameters to create a Name object with given first and last name
 * //TBC - pg. 40
 *
 * @author hawyarfarooq
 */

import java.util.Scanner;

public class TryAtHome {

    String firstName;
    String lastName;

    public TryAtHome() {
        this.firstName = null;
        this.lastName = null;
    }

    public TryAtHome(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return (this.lastName + ", " + this.firstName + ".");
    }

    public int[] count() {
        int fNameCount = this.firstName.length();
        int lNameCount = this.lastName.length();

        int[] count = {fNameCount, lNameCount};

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first name");
        String userFName = s.nextLine();

        System.out.println("Enter your last name");
        String userLName = s.nextLine();


        TryAtHome name1 = new TryAtHome(userFName, userLName);
        TryAtHome name2 = new TryAtHome();

        name2.setName(userFName, userLName);

        System.out.println("Name 1 character count: " + name1.count()[0] + "\n" + "Name 2 character count: " + name2.count()[1]);
        System.out.println("Name 1 : " + name1.getName() + "\n" + "Name 2: " + name2.getName());

    }
}
