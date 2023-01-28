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
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        int min = 0;
        if (number1 > number3 && number2 > number1) {
            max = number2;
            min = number3;
        } else if (number1 > number3 && number3 > number2) {
            max = number1;
            min = number2;
        } else if (number1 > number3 && number2 > number3) {
            max = number1;
            min = number3;
        } else if (number2 > number3 && number3 > number1) {
            max = number2;
            min = number1;
        } else if (number3 > number2 && number2 > number1) {
            max = number3;
            min = number1;
        } else {
            max = number3;
            min = number2;
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
        int number = 0;
        for (int i = 1; i < 24; i += 2) {
            if (number % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%2d%s", i, " ");
            number++;
        }
        for (; number % 5 > 0; number++) {
            System.out.printf("%2d%s", 0, " ");
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        number1 = 3242592;
        int countTwos = 0;
        System.out.print("Число " + number1 + " содержит ");
        while (number1 > 0) {
            int digit = 0;
            digit = number1 % 10;
            number1 /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }
        String even = "не четное";
        if (countTwos % 2 == 0) {
            even = " (четное)";
        }
        System.out.println(countTwos + even + " количество двоек.");

        System.out.println("\n6. Отображение фигур в консоли");
        char asterisk = '*';
        char hash = '#';
        char dollarSign = '$';
        for (int x = 0; x < 5; x++) {
            for(int i = 0; i < 10; i++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
        int i = 0;
        while(i < 5) {
            int j = 5;
            while(j > i) {
                System.out.print(hash);
                j--;
            }
            System.out.println();
            i++;
        }

        // не могу решить эту задачу только с помощью цикла do while.
        // направь пожалуйста на верное решение
        number1 = 0;
        do {
            if (number1 == 0 || number1 == 4) {
                System.out.print(dollarSign);
            } else if (number1 == 1 || number1 == 3) {
                System.out.print(dollarSign + "" + dollarSign);
            } else if (number1 == 2) {
                System.out.print(dollarSign + "" + dollarSign + "" + dollarSign);
            }
            ++number1;
            System.out.println();
            i--;
        } while(i > 0);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.println("Dec  Char");
        int code = 0;
        for (char symbol = 0; symbol < 255; symbol++) {
            code = (int) symbol;
            if (symbol % 2 == 0 && symbol > 0 && symbol < 48) {
                System.out.printf("%3d", code);
                System.out.printf("%6c", symbol);
                System.out.println();
            } else if (symbol > 96 && symbol < 123) {
                System.out.printf("%3d", code);
                System.out.printf("%6c", symbol);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        int r = number;
        int rev = 0;
        while(r > 0) {
            number1 = r % 10;
            rev = rev * 10 + number1;
            r /= 10;
        }
        if (rev == number) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 659965;
        r = number;
        int revRight = 0;
        int revLeft = 0;
        int sumRight = 0;
        int sumLeft = 0;
        for (i = 0; i < 3; i++) {
            number1 = r % 10;
            r /= 10;
            sumRight += number1;
            revRight = revRight * 10 + number1;
        }
        r = number / 1000;
        for (i = 0; i < 3; i++) {
            number1 = r % 10;
            r /= 10;
            sumLeft += number1;
            revLeft = revLeft * 10 + number1;
        }
        if (sumLeft == sumRight) {
            System.out.println("Сумма цифр \n" + revLeft + " = " + sumLeft + 
                    "\n" + revRight + " = " + sumRight + "\nЧисло счастливое");
        } else {
            System.out.println("Сумма цифр \n" + revLeft + " = " + sumLeft + 
                    "\n" + revRight + " = " + sumRight + "\nЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифогора.");
        for(i = 1; i <= 9; i++) {
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
                for (int k = 1; k <= 9; k++) {
                    System.out.print("___");
                }
            }
            System.out.println();
        }
    }
}