package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, com.kodilla.stream.lambda.MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}