public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.\n");
        byte ddr4 = 8;
        System.out.println("DDR4 " + ddr4 + " GB");
        short intel = 64;
        System.out.println("Intel " + intel);
        int videoCardModel = 940;
        System.out.println("Модель видео карты " + videoCardModel);
        long hdd = 1000000L;
        System.out.println("HDD " + hdd + " mb");
        float ghz = 2.3f;
        System.out.println("Ghz " + ghz);
        double version = 1.03d;
        System.out.println("Version " + version);
        char model = 'V';
        System.out.println("Model " + model);

        System.out.println("\n2. Расчет стоимости товара со скидкой.\n");
        int penPrice = 100;
        int bookPrice = 200;
        int sumPrice = penPrice + bookPrice;
        int discountSum = (sumPrice / 100) * 11;
        int discountPrice = sumPrice - discountSum;
        System.out.println("1. Сумма скидки " + discountSum
        +  "\n2. Общая стоимость товаров со скидкой " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("    J   a  v     v  a   \n" + 
                "    J  a a  v   v  a a\n" + 
                " J  J aaaaa  V V  aaaaa\n" + 
                "  JJ a     a  V  a     a\n");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.\n");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("Переменная типа byte:\n" + byteMax + " " + 
                ++byteMax + " " + --byteMax);
        System.out.println("\nПеременная типа Short:\n" + shortMax + " " + 
                ++shortMax + " " + --shortMax);
        System.out.println("\nПеременная типа Integer:\n" + intMax + " " + 
                ++intMax+ " " + --intMax);
        System.out.println("\nПеременная типа Long:\n" + longMax + " " + 
                ++longMax + " " + --longMax);

        System.out.println("\n5. Перестановка значений переменных.\n");
        int number1 = 2;
        int number2 = 5;
        System.out.println("1. С помощью третьей переменной.\n" 
                + "Исходные значения: " + "Переменная № 1 = " 
                + number1 + ". Переменная № 2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + number1 +
                ". Переменная № 2 = " + number2);
        System.out.println("\n2. С помощью арифметических операций.\n" 
                + "Исходные значения: " + "Переменная № 1 = " 
                + number1 + ". Переменная № 2 = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + number1 +
                ". Переменная № 2 = " + number2);
        System.out.println("\n3. С помощью побитовой операции.\n" 
        + "Исходные значения: " + "Переменная № 1 = " 
        + number1 + ". Переменная № 2 = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + number1 + ". Переменная № 2 = " + number2);

        System.out.println("\n6. Вывод символов и их кодов.\n");
        char lattice = '#';
        System.out.println("Код символа 35 соответствует символу " + lattice);
        char ampersand = '&';
        System.out.println("Код символа 38 соответствует символу " + ampersand);
        char at = '@';
        System.out.println("Код символа 64 соответствует символу " + at);
        char caret = '^';
        System.out.println("Код символа 94 соответствует символу " + caret);
        char underscore = '_';
        System.out.println("Код символа 95 соответствует символу " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.\n");
        char slash = '/';
        char backslash = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';
        System.out.println("    " + slash + backslash +
                "\n   " + slash + "  " + backslash + 
                "\n  " + slash + underscore + leftParentheses + 
                " " + rightParentheses + backslash + 
                "\n " + slash + "      " + backslash + 
                "\n" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");
        number1 = 123;
        int ones = number1%10;
        number1 /= 10;
        int tens = number1%10;
        number1 /= 10;
        int hundreds = number1%10;
        int sumDigits = ones + tens + hundreds;
        int productDigits = ones * tens * hundreds;
        System.out.println("Число 123 содержит\n" + 
                hundreds + " сотню\n" + tens + " десятка\n" + 
                ones + " единицы\n" + "Сумма цифр = " + 
                sumDigits + "\nПроизведение = " + productDigits);

        System.out.println("\n9. Вывод времени.\n");
        number1 = 86399;
        int hour = number1 / 3600;
        int minute = number1 / 1440;
        int second = number1 % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}