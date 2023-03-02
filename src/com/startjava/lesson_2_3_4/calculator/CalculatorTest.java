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
                if (calculator.calculate(scanner.nextLine()) % 1 == 0) {
                    System.out.printf("%.0f", calculator.getResult());
                } else {
                    System.out.printf("%.3f", calculator.getResult());
                }
            }
            System.out.println("\nХотите продолжить вычисления?[yes/no] :");
            answer = scanner.nextLine().toLowerCase();
        }
    }
}