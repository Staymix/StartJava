package com.startjava.lesson_2_3.guess;

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
        System.out.println("Я загадал число от 1 до 100!");
        do {
            startGameplay(player1);
            if (player1.getNumber() == targetNumber) {
                break;
            }
            startGameplay(player2);
            if (player2.getNumber() == targetNumber) {
                break;
            }
        } while (true);
    }

    public void startGameplay(Player player) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Игрок " + player.getName() + " введите ваше число.");
            player.setNumber(scanner.nextInt());
            if (isGuessed(player)) {
                break;
            }
        } while (false);
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " выиграл, это число: " + 
                    targetNumber);
            return true;
        } if (player.getNumber() > targetNumber) {
            System.out.println("Число " + player.getNumber() + " игрока " + player.getName() +
                    " больше того, что загадал компьютер!");
        } else {
            System.out.println("Число " + player.getNumber() + " игрока " + player.getName() +
                    " меньше того, что загадал компьютер!");
        }
        return false;
    }
}