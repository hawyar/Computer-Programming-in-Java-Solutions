package chapter3;

import java.util.Scanner;

public class c_1 {
    public String result(double score) {
        while (score >= 0 && score < 10) {
            if (score >= 5) {
                return "pass";
            }  else {
                return "fail";
            }
        }
        return "Please enter a valid number between 0 and 10 [inclusive] ";
    }

    public static void main(String[] args) {


        System.out.println("Please enter a number");
        Scanner s = new Scanner(System.in);

        double userInput = s.nextInt();

        c_1 cu = new c_1();


        System.out.println(cu.result(userInput));

    }


}
