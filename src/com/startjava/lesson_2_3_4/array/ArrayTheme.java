package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива.");
        int[] intArr = {2, 6, 3, 7, 1, 4, 5};
        ArrayTheme.foreach(intArr);
        int length = intArr.length;
        for (int i = 0; i < length / 2; i++) {
            int num = intArr[i];
            intArr [i] = intArr[length - 1 - i];
            intArr[length - 1 - i] = num;
        }
        ArrayTheme.foreach(intArr);

        System.out.println("\n2. Вывод произведения элементов массива.");
        int[] intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int sum = 1;
        length = intArray.length;
        for (int i = 1; i < length - 1; i++) {
            sum *= intArray[i];
            if (i < 8) {
                System.out.print(intArray[i] + " * ");
            } else {
                System.out.print(intArray[i]);
            }
        }
        System.out.println(" = " + sum);
        System.out.println(intArray[0] + " " + intArray[9]);


        System.out.println("\n3. Удаление элементов массива.");
        float[] floatArr = new float[15];
        length = floatArr.length;
        for (int i = 0; i < length; i++) {
            floatArr[i] = (float) Math.random();
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f%s", floatArr[i], " ");
            if (i == 7) {
                System.out.println();
            }
        }
        float numMiddle = floatArr[length / 2];
        System.out.println("\nИзминенный массив: ");
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (floatArr[i] > numMiddle) {
                floatArr[i] = 0f;
                counter++;
            }
            System.out.printf("%.3f%s", floatArr[i], " ");
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке.");
        char[] charArr = new char[26];
        char letter = 65;
        length = charArr.length;
        for (int i = 0; i < length; i++) {
            charArr[i] = letter++;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел.");
        int[] intArra = new int[30];
        length = intArra.length;
        for (int i = 0; i < length; i++) {
            intArra[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                while (intArra[j] == intArra[i]) {
                    intArra[i] = (int) (60 + Math.random() * 40);
                    j = 0;
                }
            }
        }
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (intArra[i] > intArra[i + 1]) {
                    isSorted = false;
                    int num = intArra[i];
                    intArra[i] = intArra[i + 1];
                    intArra[i + 1] = num;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if ((i % 10) == 0) {
                System.out.println();
            }
            System.out.print(intArra[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива.");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        counter = 0;
        length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].isEmpty() || strArr[i].contains(" ")) {
                counter++;
            }
        }
        ArrayTheme.foreachStr(strArr);
        String[] strArrCopy = new String[length - counter];
        counter = 0;
        int num = 0;
        for (int i = 0; i < length; i++) {
            num = i;
            if (strArr[i].isEmpty() || strArr[i].contains(" ")) {
                counter++;
            } else {
                System.arraycopy(strArr, num, strArrCopy, num - counter, 1);
            }
        }
        ArrayTheme.foreachStr(strArrCopy);
    }

    private static void foreach (int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void foreachStr (String[] arr) {
        for (String str: arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}