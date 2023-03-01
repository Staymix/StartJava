package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] number = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return number;
    }

    public int getNumber(int x) {
        return number[x];
    }

    public void setNumber(int[] array) {
        number = array;
    }

    public void setNumber(int index, int num) {
        number[index] = num;
    }
}