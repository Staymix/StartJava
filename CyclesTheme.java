public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = startRange;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            } counter++;
        } while (counter <= endRange);
        System.out.println("в промежутке [" + startRange + ", " + endRange + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = -1;
        int number2 = 10;
        int number3 = 5;
        int max = number1;
        int min = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        for (max--; max > min; max--) {
            System.out.print(max + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number1 = 1234;
        int sumDigits = 0;
        while (number1 > 0) {
            int digit = number1 % 10;
            sumDigits += digit;
            number1 /= 10;
            System.out.print(digit);
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            if (counter % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%2d%s", i, " ");
            counter++;
        }
        for (; counter % 5 > 0; counter++) {
            System.out.printf("%2d%s", 0, " ");
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        number1 = 3242592;
        int countTwos = 0;
        System.out.print("Число " + number1 + " содержит ");
        while (number1 > 0) {
            int digit = number1 % 10;
            number1 /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }
        String even = " (не четное)";
        if (countTwos % 2 == 0) {
            even = " (четное)";
        }
        System.out.println(countTwos + even + " количество двоек.");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        counter = 0;
        while(counter < 5) {
            int triangleWidth = 5;
            while(triangleWidth > counter) {
                System.out.print('#');
                triangleWidth--;
            }
            System.out.println();
            counter++;
        }

        counter = 5;
        do {
            System.out.print('$');
            if (counter == 3) {
                System.out.print('$' + "" + '$');
            } else if (counter % 2 == 0) {
                System.out.print('$');
            }
            System.out.println();
            counter--;
        } while(counter > 0);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.println("Dec  Char");
        for (char symbol = 0; symbol < 255; symbol++) {
            if (symbol > 0 && symbol < 48 && symbol % 2 != 0) {
                System.out.printf("%3d%6c%n", (int) symbol, symbol);
            } else if (symbol > 96 && symbol < 123 && symbol % 2 == 0) {
                System.out.printf("%3d%6c%n", (int) symbol, symbol);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number = 1234321;
        int copyNumber = number;
        int revers = 0;
        while(copyNumber > 0) {
            int digit = copyNumber % 10;
            revers = revers * 10 + digit;
            copyNumber /= 10;
        }
        if (revers == number) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123456;
        copyNumber = number;
        int sumDigitsRight = 0;
        int sumDigitsLeft = 0;
        int remainderOfDivision;
        for (int i = 0; i < 6; i++) {
            remainderOfDivision = copyNumber % 10;
            copyNumber /= 10;
            if (i < 3) {
                sumDigitsRight += remainderOfDivision;
            } else {
                sumDigitsLeft += remainderOfDivision;
            }
        }
        System.out.println("Сумма цифр \n" + (number / 1000) + " = " + sumDigitsLeft + 
                    "\n" + (number % 1000) + " = " + sumDigitsRight);
        if (sumDigitsLeft == sumDigitsRight) {
             System.out.println("Число счастливое");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        for(int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("%2s", "|");
            } else {
                System.out.print(i + "|");
            }
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", j * i);
            }
            if (i == 1) {
                System.out.println();
                for (int j = 1; j <= 9; j++) {
                    System.out.print("___");
                }
            }
            System.out.println();
        }
    }
}