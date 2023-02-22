package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            calculator.calculate();
            scanner.nextLine();
            do {
                System.out.println("\nХотите продолжить вычисления?[yes/no] :");
                answer = scanner.nextLine().toLowerCase();
            } while(!"no".equals(answer) && !"yes".equals(answer));
        } while (!"no".equals(answer));
    }
}