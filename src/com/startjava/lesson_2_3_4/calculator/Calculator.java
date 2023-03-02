package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

public class Calculator {
    private double number1;
    private double number2;
    private char sign;
    private  String  mathematicalExpression;
    private String[] data = new String[3];
    private double result;

    public double getResult() {
        return result;
    }

    public double calculate(String mathematicalExpression) {
        this.mathematicalExpression = mathematicalExpression;
        assignValues();
        switch(sign) {
            case '*' :
                result = number1 * number2;
                break;
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '^' :
                result = (int) Math.pow(number1, number2);
                break;
            case '%' :
                result = number1 % number2;
        }
        displayMathematicalExpression();
        return result;
    }

    public void assignValues() {
        data = mathematicalExpression.split(" ");
        number1 = Integer.parseInt(data[0]);
        sign = data[1].charAt(0);
        number2 = Integer.parseInt(data[2]);
    }

    public void displayMathematicalExpression() {
        System.out.printf("%.0f %c %.0f = ", number1, sign, number2);
    }
}