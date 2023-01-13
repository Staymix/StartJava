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
        int sumDiscount = (sumPrice / 100) * 11;
        int priceDiscount = sumPrice - sumDiscount;
        System.out.println("1. Сумма скидки " + sumDiscount
        +  "\n2. Общая стоимость товаров со скидкой " + priceDiscount);

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
        System.out.println("Первоначальные значения:\n" + byteMax + "\n" + shortMax + "\n" + 
        intMax + "\n" + longMax);
        byteMax++;
        shortMax++;
        intMax++;
        longMax++;
        System.out.println("\nЗначение после инкремента:\n" + byteMax + "\n" + shortMax + "\n" + 
        intMax + "\n" + longMax);
        byteMax--;
        shortMax--; 
        intMax--;
        longMax--;
        System.out.println("\nЗначение после декремента:\n" + byteMax + "\n" + shortMax + "\n" + 
        intMax + "\n" + longMax);

        System.out.println("\n5. Перестановка значений переменных.\n");
        int number1 = 2;
        int number2 = 5;
        int number3;
        System.out.println("1. С помощью третьей переменной.\n" 
        + "Исходные значения: " + "Переменная № 1 = " 
        + number1 + ". Переменная № 2 = " + number2);
        number3 = number1;
        number1 = number2;
        number2 = number3;
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
        number1 = number1 ^ number2;
        number2 = number2 ^ number1;
        number1 = number1 ^ number2;
        System.out.println("Новые значения переменных: " 
        + "Переменная № 1 = " + number1 + ". Переменная № 2 = " + number2);

        System.out.println("\n6. Вывод символов и их кодов.\n");
        char lattice = 35;
        System.out.println("Код символа 35\nСимвол " + lattice);
        char ampersand = 38;
        System.out.println("Код символа 38\nСимвол " + ampersand);
        char at = 64;
        System.out.println("Код символа 64\nСимвол " + at);
        char caret = 94;
        System.out.println("Код символа 94\nСимвол " + caret);
        char underscore = 95;
        System.out.println("Код символа 95\nСимвол " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.\n");
        char solidus = '/';
        // не компилируется '\'
        char reverse = 92;
        char open = '(';
        char close = ')';
        char horizontalBar = '_';
        System.out.println("    " + solidus + reverse +
        "\n   " + solidus + "  " + reverse + 
        "\n  " + solidus + horizontalBar + open + 
        " " + close + reverse + 
        "\n " + solidus + "      " + reverse + 
        "\n" + solidus + horizontalBar + horizontalBar + horizontalBar + 
        horizontalBar + solidus + reverse + horizontalBar + horizontalBar + reverse);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");
        number1 = 123;
        System.out.println("Число " + number1 + " содержит :");
        number2 = number1 / 100;
        System.out.println(number2 + " сотню");
        number3 = number1 / 10;
        System.out.println(number3 + " десятков");
        int number4 = number1 / 1;
        System.out.println(number4 + " единицы");
        int unit1 = number1%10;
        number1 /= 10;
        int unit2 = number1%10;
        number1 /= 10;
        int unit3 = number1%10;
        int sumnumb = unit1 + unit2 + unit3;
        int product = unit1 * unit2 * unit3;
        System.out.println("Сумма цифр = " + sumnumb + 
        "\nПроизведение = " + product);

        System.out.println("\n9. Вывод времени.\n");
        number1 = 86399;
        int hour = number1 % 24;
        int minute = number1 % 60;
        int second = 86399 - (hour * 60 * 60 + (minute * 60));
        System.out.println(hour + ":" + minute + ":" + second);
    }
}