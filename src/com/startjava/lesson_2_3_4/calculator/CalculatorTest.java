package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (!"no".equals(answer)) {
            if ("yes".equals(answer)) {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                double result = calculator.calculate(expression);
                System.out.print(expression + " = ");
                System.out.printf((result % 1 == 0 ? "%.0f" : "%.3f"), result);
            }
            System.out.println("\nХотите продолжить вычисления?[yes/no] :");
            answer = scanner.nextLine().toLowerCase();
        }
    }
}
