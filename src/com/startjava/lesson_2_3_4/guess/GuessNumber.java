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
            if (startGameplay(player1)) {
                break;
            }
            if (startGameplay(player2)) {
                break;
            }
        } while (true);
    }

    public boolean startGameplay(Player player) {
        System.out.println("У каждого игрока по 10 попыток.");
        attempt = 0;
        boolean isGuessed = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Игрок " + player.getName() + " введите ваше число.");
            attempt++;
            player.setNumber(attempt - 1, scanner.nextInt());
            if (isGuessed(player)) {
                isGuessed = true;
                break;
            }
        } while (attempt <= 9);
        if (attempt == 10) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        displayArray(player);
        return isGuessed;
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber(attempt - 1) == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " c "
                    + attempt + " попытки.");
            return true;
        } if (player.getNumber(attempt - 1) > targetNumber) {
            System.out.println("Число " + player.getNumber(attempt - 1) + " игрока " + player.getName() +
                    " больше того, что загадал компьютер!");
            return false;
        }
        System.out.println("Число " + player.getNumber(attempt - 1) + " игрока " + player.getName() +
                " меньше того, что загадал компьютер!");
        return false;
    }

    public void displayArray(Player player) {
        int[] enteredNumbers = Arrays.copyOf(player.getNumber(), attempt);
        for (int i = 0; i < enteredNumbers.length; i++) {
            if (enteredNumbers.length / 2 == i) {
                System.out.println();
            }
            System.out.printf("%2d ", enteredNumbers[i]);
        }
        System.out.println();
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        player.setNumber(enteredNumbers);
    }
}