package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double number1;
    private double number2;
    private char sign;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public char getSign() {
        return sign;
    }

    public double calculate(String expression) {
        perseExpression(expression);
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

    public void perseExpression(String expression) {
        String[] data = new String[3];
        data = expression.split(" ");
        number1 = Integer.parseInt(data[0]);
        sign = data[1].charAt(0);
        number2 = Integer.parseInt(data[2]);
    }
}