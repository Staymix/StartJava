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
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        } if (max < number3) {
            max = number3;
        }
        if (number1 > number2) {
            min = number2;
        } else {
            min = number1;
        } if (min > number3) {
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
        String even = "не четное";
        if (countTwos % 2 == 0) {
            even = " (четное)";
        }
        System.out.println(countTwos + even + " количество двоек.");

        System.out.println("\n6. Отображение фигур в консоли");
        char asterisk = '*';
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }

        counter = 0;
        char hash = '#';
        while(counter < 5) {
            int j = 5;
            while(j > counter) {
                System.out.print(hash);
                j--;
            }
            System.out.println();
            counter++;
        }

        counter = 5;
        char dollarSign = '$';
        do {
            System.out.print(dollarSign);
            if (counter == 3) {
                System.out.print(dollarSign + "" + dollarSign);
            } else if (counter % 2 == 0) {
                System.out.print(dollarSign);
            }
            System.out.println();
            counter--;
        } while(counter > 0);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.println("Dec  Char");
        for (char symbol = 0; symbol < 255; symbol++) {
            if (symbol > 0 && symbol < 48 && symbol % 2 == 0) {
                System.out.printf("%3d%6c%s", (int) symbol, symbol, "\n");
            } else if (symbol > 96 && symbol < 123) {
                System.out.printf("%3d%6c%s", (int) symbol, symbol, "\n");
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number = 1234321;
        int copyNumber = number;
        int revers = 0;
        while(copyNumber > 0) {
            number1 = copyNumber % 10;
            revers = revers * 10 + number1;
            copyNumber /= 10;
        }
        if (revers == number) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 654321;
        copyNumber = number;
        int digitsRight = 0;
        int digitsLeft = 0;
        int sumDigitsRight = 0;
        int sumDigitsLeft = 0;
        int remainderOfDivision;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                remainderOfDivision = copyNumber % 10;
                copyNumber /= 10;
                sumDigitsRight += remainderOfDivision;
                digitsRight = digitsRight * 10 + remainderOfDivision;
            } else {
                remainderOfDivision = copyNumber % 10;
                copyNumber /= 10;
                sumDigitsLeft += remainderOfDivision;
                digitsLeft = digitsLeft * 10 + remainderOfDivision;
            }
        }
        if (sumDigitsLeft == sumDigitsRight) {
            System.out.println("Сумма цифр \n" + digitsLeft + " = " + sumDigitsLeft + 
                    "\n" + digitsRight + " = " + sumDigitsRight + "\nЧисло счастливое");
        } else {
            System.out.println("Сумма цифр \n" + digitsLeft + " = " + sumDigitsLeft + 
                    "\n" + digitsRight + " = " + sumDigitsRight + "\nЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифогора.");
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
                for (int k = 1; k <= 9; k++) {
                    System.out.print("___");
                }
            }
            System.out.println();
        }
    }
}