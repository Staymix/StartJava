package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива.");
        int[] intArr = {2, 6, 3, 7, 1, 4, 5};
        displayArray(intArr);
        int length = intArr.length;
        for (int i = 0; i < length--; i++) {
            int num = intArr[i];
            intArr[i] = intArr[length];
            intArr[length] = num;
        }
        displayArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива.");
        int[] intArr2 = new int[10];
        length = intArr2.length;
        for (int i = 0; i < length; i++) {
            intArr2[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= intArr2[i];
            System.out.print((intArr2[i]) + (intArr2[i] < length - 2 ? " * " : " = " + product));
        }
        System.out.println("\n" + intArr2[0] + " " + intArr2[9]);

        System.out.println("\n3. Удаление элементов массива.");
        float[] floatArr = new float[15];
        length = floatArr.length;
        for (int i = 0; i < length; i++) {
            floatArr[i] = (float) Math.random();
        }
        System.out.println("Исходный массив:");
        displayArrayFloat(floatArr);
        float middleCellValue = floatArr[length / 2];
        System.out.println("\nИзмененный массив:");
        int countCells = 0;
        for (int i = 0; i < length; i++) {
            if (floatArr[i] > middleCellValue) {
                floatArr[i] = 0f;
                countCells++;
            }
        }
        displayArrayFloat(floatArr);
        System.out.println("\nКоличество обнуленных ячеек: " + countCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке.");
        char[] alphabet  = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел.");
        int[] uniqueNumbers = new int[30];
        length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            uniqueNumbers[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] == uniqueNumbers[i]) {
                    i -= 1;
                    break;
                }
            }
        }
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (uniqueNumbers[i] > uniqueNumbers[i + 1]) {
                    isSorted = false;
                    int num = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[i + 1];
                    uniqueNumbers[i + 1] = num;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if ((i % 10) == 0) {
                System.out.println();
            }
            System.out.print(uniqueNumbers[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива.");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        countCells = 0;
        length = srcStrings.length;
        for (int i = 0; i < length; i++) {
            if (srcStrings[i].isEmpty() || srcStrings[i].contains(" ")) {
                countCells++;
            }
        }
        displayArrayStr(srcStrings);
        String[] destStrings = new String[length - countCells];
        countCells = 0;
        int num = 0;
        for (int i = 0; i < length; i++) {
            num = i;
            if (srcStrings[i].isBlank()) {
                countCells++;
            } else {
                System.arraycopy(srcStrings, num, destStrings, num - countCells, 1);
            }
        }
        displayArrayStr(destStrings);
    }

    private static void displayArray (int[] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void displayArrayStr (String[] arr) {
        for (String str: arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private  static void displayArrayFloat (float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f%s", arr[i], " ");
            if (i == 7) {
                System.out.println();
            }
        }
    }
}