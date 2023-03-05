package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrNumber(int index) {
        int[] enteredNumbers = Arrays.copyOf(numbers, index);
        Arrays.fill(numbers, 0, index, 0);
        System.out.println(Arrays.toString(numbers));
        return enteredNumbers;
    }

    public int getNumber(int number) {
        return numbers[number];
    }

    public void addNumber(int index, int num) {
        numbers[index] = num;
    }
}