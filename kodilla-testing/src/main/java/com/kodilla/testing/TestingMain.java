package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;



/**
 * Created by Bartosz Biernacki.
 */
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator myCalculator = new Calculator("Calculator");

        int sum = myCalculator.add(7, 9);

        if (sum == 16) {
            System.out.println("Test Add OK");
        } else {
            System.out.println("Eror");
        }

        int substract = myCalculator.subtract(21, 7);

        if (substract == 14) {
            System.out.println("Test Substract OK");
        } else {
            System.out.println("Error");

        }

    }
}

