package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while(!"no".equals(answer)) {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = scanner.nextLine().toLowerCase();
        }
    }
}