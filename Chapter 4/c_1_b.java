package chapter3;

import java.util.Scanner;

public class c_1_b {

    public boolean equalString(String s1, String s2 ) {
        if (s1.compareTo(s2) == 0) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a string");
        String s1 = s.nextLine();

        System.out.println("Please enter another string");
        String s2 = s.nextLine();


        c_1_b stringCheck = new c_1_b();

        System.out.println(stringCheck.equalString(s1, s2));






    }
}


