package com.startjava.lesson_1.final;

public class MyFirstGame {
    public static void main(String[] args) {
        int playNumber = 50;
        int computerNumber = 60;
        while (playNumber != computerNumber) {
            if (playNumber > computerNumber) {
                System.out.println("Число " + playNumber + " больше того, что загадал компьютер");
                playNumber--;
            } else if (playNumber < computerNumber) {
                System.out.println("Число " + playNumber + " меньше того, что загадал компьютер");
                playNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}