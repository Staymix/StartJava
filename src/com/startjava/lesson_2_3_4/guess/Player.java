package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt() {
        attempt++;
    }

    public void addNumber(int number) {
        numbers[attempt - 1] = number;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attempt - 1, 0);
        attempt = 0;
    }
}