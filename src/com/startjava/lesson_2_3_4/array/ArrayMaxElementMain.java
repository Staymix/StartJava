package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива!");
        int[] maxLength = new int[scanner.nextInt()];
        System.out.print("Заполните массив целыми числами через пробел: ");
        for (int i = 0; i < maxLength.length; i++) {
            maxLength[i] = scanner.nextInt();
        }
        for(int x: maxLength) {
            System.out.println(x);
        }
        int max = maxLength[0];
        for (int i = 0; i < maxLength.length; i++) {
            if (max < maxLength[i]) {
                max = maxLength[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
