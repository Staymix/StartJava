package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double number1;
    private double number2;
    private char sign;

    public double calculate(String expression) {
        parseExpression(expression);
        switch(sign) {
            case '*':
                return number1 * number2;
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '/':
                return number1 / number2;
            case '^':
                return (int) Math.pow(number1, number2);
            case '%':
                return number1 % number2;
        }
        return sign;
    }

    public void parseExpression(String expression) {
        String[] partsExpression = new String[3];
        partsExpression = expression.split(" ");
        number1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        number2 = Integer.parseInt(partsExpression[2]);
    }
}