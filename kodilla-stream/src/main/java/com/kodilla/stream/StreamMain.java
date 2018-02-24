package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //  System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        // Zadanie 7.1

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("XYZ", (text) -> text + "ABC");
        poemBeautifier.beautify("talk capslock", (text) -> text.toUpperCase());
        poemBeautifier.beautify("XYZ", (text) -> text.toLowerCase());
        poemBeautifier.beautify("123456789", (text) -> text.substring(3));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        com.kodilla.stream.iterate.NumbersGenerator.generateEven(20);
    }

}

