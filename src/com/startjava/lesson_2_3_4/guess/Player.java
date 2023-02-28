package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] number = new int[10];
    private int i;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int x) {
        return number[x];
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int num) {
        number[i] = num;
        i++;
    }
}