package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player player1;
    private Player player2;
    private int attempt;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        targetNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Я загадал число от 1 до 100!");
        do {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        } while (true);
    }

    public boolean isGuessed(Player player) {
        if (player.getGameNumber() > 0) {
            player.clearArray(attempt);
        }
        System.out.println("У каждого игрока по 10 попыток.");
        attempt = 0;
        boolean isGuessed = false;
        do {
            enterNumber(player);
            if (compareNumbers(player)) {
                isGuessed = true;
                break;
            }
        } while (attempt < 10);
        if (attempt == 10) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        printPlayerNumbers(player);
        return isGuessed;
    }

    private boolean compareNumbers(Player player) {
        int playerNumber = player.getNumber(attempt - 1);
        String playerName = player.getName();
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + playerName + " угадал число " + targetNumber + " c " + attempt + " попытки.");
            return true;
        } if (playerNumber > targetNumber) {
            System.out.println("Число " + playerNumber + " игрока " + playerName +
                    " больше того, что загадал компьютер!");
        } else {
            System.out.println("Число " + playerNumber + " игрока " + playerName +
                    " меньше того, что загадал компьютер!");
        }
        return false;
    }

    public void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите ваше число.");
        player.addNumber(attempt, scanner.nextInt());
        attempt++;
    }

    public void printPlayerNumbers(Player player) {
        int[] enteredNumbers = player.getNumbers(attempt);
        for (int i = 0; i < enteredNumbers.length; i++) {
            if (enteredNumbers.length / 2 == i) {
                System.out.println();
            }
            System.out.printf("%2d ", enteredNumbers[i]);
        }
        System.out.println();
    }
}