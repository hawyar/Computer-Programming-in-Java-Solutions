package chapter3;

import java.util.Scanner;

public class c_1_a {
    public String result(double score) {
        if (score >= 5) {
            return "pass";
        }  else {
            return "fail";
        }
    }

}

    public static void main(String[] args) {

        while (score >= 0 && score < 10) {

            System.out.println("Please enter a number");
            Scanner s = new Scanner(System.in);

            double userInput = s.nextInt();

            c_1_a scoreCheck = new c_1_a();


            System.out.println(scoreCheck.result(userInput));

        }
    }
}
