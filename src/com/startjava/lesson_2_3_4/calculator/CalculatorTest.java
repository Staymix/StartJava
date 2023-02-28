package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите математическое выражение: ");
                calculator.setMathematicalExpression(scanner.nextLine());
                calculator.calculate();
                if (calculator.getResult() - ((int) Math.floor(calculator.getResult())) == 0.0) {
                    System.out.printf("%.0f", calculator.getResult());
                } else {
                    System.out.printf("%.3f", calculator.getResult());
                }
                answer = null;
            } else if ("no".equals(answer)) {
                break;
            } else {
                System.out.println("\nХотите продолжить вычисления?[yes/no] :");
                answer = scanner.nextLine().toLowerCase();
            }
        } while (true);
    }
}