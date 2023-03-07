package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        targetNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число от 1 до 100!");
        System.out.println("У каждого игрока по 10 попыток.");
        do {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        } while (player1.getAttempt() != 10 && player2.getAttempt() != 10);
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
        player1.clearNumbers();
        player2.clearNumbers();
    }

    public boolean isGuessed(Player player) {
        player.setAttempt();
        boolean isGuessed = false;
        enterNumber(player);
        if (compareNumbers(player)) {
            isGuessed = true;
        }
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        return isGuessed;
    }

    public void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите ваше число.");
        player.addNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber();
        String playerName = player.getName();
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + playerName + " угадал число " + targetNumber +
                    " c " + player.getAttempt() + " попытки.");
            return true;
        }
        if (playerNumber > targetNumber) {
            System.out.println("Число " + playerNumber + " игрока " + playerName +
                    " больше того, что загадал компьютер!");
        } else {
            System.out.println("Число " + playerNumber + " игрока " + playerName +
                    " меньше того, что загадал компьютер!");
        }
        return false;
    }

    public void printPlayerNumbers(Player player) {
        int[] enteredNumbers = player.getNumbers();
        System.out.println("Числа названные игроком " + player.getName() + ": ");
        for (int i = 0; i < enteredNumbers.length; i++) {
            if (enteredNumbers.length / 2 == i) {
                System.out.println();
            }
            System.out.printf("%2d ", enteredNumbers[i]);
        }
        System.out.println();
    }
}