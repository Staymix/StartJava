package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];
    private int gameNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers(int index) {
        gameNumber++;
        return Arrays.copyOf(numbers, index);
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public int getNumber(int number) {
        return numbers[number];
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
    }

    public void clearArray(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}