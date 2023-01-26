public class CyclesTheme {
    public static void main(String[] args){

        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int numberMin = -10;
        int numberMax = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int number = numberMin;
        do {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            } number++;
        } while (number <= numberMax);
        System.out.println("в промежутке [" + numberMin + ", " + numberMax + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        numberMax = 0;
        numberMin = 0;
        if (number1 > number2 && number1 > number3) {
            numberMax = number1;
            if (number2 < number3) {
                numberMin = number2;
            } else {
                numberMin = number3;
            }
        } else if (number2 > number1 && number2 > number3) {
            numberMax = number2;
            if (number1 < number3) {
                numberMin = number1;
            } else {
                numberMin = number3;
            }
        } else {
            numberMax = number3;
            if (number1 < number2) {
                numberMin = number1;
            } else {
                numberMin = number2;
            }
        }
        for (numberMax--; numberMax > numberMin; numberMax--) {
            System.out.print(numberMax + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number1 = 1234;
        int sumNum = 0;
        int num = 0;
        while (number1 > 0) {
            num = number1 % 10;
            sumNum += num;
            number1 /= 10;
            System.out.print(num);
        }
        System.out.println("\n" + sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        number = 0;
        for (int i = 1; i < 24; i += 2) {
            if (number % 5 == 0) {
                System.out.println();
            }
            if (numberMin < 10) {
                System.out.printf("%2d", i);
                System.out.print(" ");
            } else {
                System.out.printf("%2d", i);
            }
            number++;
        }
        for (;number % 5 > 0 ; number++) {
                System.out.printf("%2d", 0);
                System.out.print(" ");
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        number1 = 3242592;
        int  theRemainderOfDividing = 0;
        int sum2 = 0;
        String even;
        System.out.print("Число " + number1 + " содержит ");
        while (number1 > 0) {
            theRemainderOfDividing = number1 % 10;
            number1 /= 10;
            if (theRemainderOfDividing == 2) {
                sum2++;
            }
        }
        if (sum2 % 2 == 0) {
            even = " (четное)";
        } else {
            even = " (не четное)";
        }
        System.out.println(sum2 + even + " количество двоек.");

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