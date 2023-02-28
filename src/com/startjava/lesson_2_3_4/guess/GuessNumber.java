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
            startGameplay(player1);
            if (player1.getNumber(attempt - 1) == targetNumber) {
                break;
            }
            startGameplay(player2);
            if (player1.getNumber(attempt - 1) == targetNumber) {
                break;
            }
        } while (true);
    }

    public void startGameplay(Player player) {
        System.out.println("У каждого игрока по 10 попыток.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Игрок " + player.getName() + " введите ваше число.");
            attempt++;
            player.setNumber(scanner.nextInt());
            if (isGuessed(player)) {
                break;
            }
        }
        if (!isGuessed(player)) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        int[] enteredNumbers = Arrays.copyOf(player1.getNumber(), attempt);
        System.out.println(Arrays.toString(enteredNumbers));
    }

    private boolean isGuessed(Player player) {
        if (player1.getNumber(attempt - 1) == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " c "
                    + attempt + " попытки.");
            return true;
        } if (player1.getNumber(attempt - 1) > targetNumber) {
            System.out.println("Число " + player1.getNumber(attempt - 1) + " игрока " + player.getName() +
                    " больше того, что загадал компьютер!");
            return false;
        }
        System.out.println("Число " + player1.getNumber(attempt - 1) + " игрока " + player.getName() +
                " меньше того, что загадал компьютер!");
        return false;
    }
}