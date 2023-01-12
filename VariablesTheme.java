public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.\n");
                byte dDR4 = 8;
        System.out.println("DDR4 " + dDR4 + " GB");
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
                int sumDiskount = (sumPrice / 100) * 11;
                int priceDiskount = sumPrice - sumDiskount;
        System.out.println("1. Сумма скидки " + sumDiskount
                +  "\n2. Общая стоимость товаров со скидкой " + priceDiskount);

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("    J   a  v     v  a   \n" + 
                "    J  a a  v   v  a a\n" + 
                " J  J aaaaa  V V  aaaaa\n" + 
                "  JJ a     a  V  a     a\n");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.\n");
                byte nm1 = 127;
        System.out.println("byte:\n" + nm1);
                nm1++;
        System.out.println(nm1);
                nm1 -= + 2;
        System.out.println(nm1);
                short nm2 = 32767;
        System.out.println("short:\n" + nm2);
                nm2++;
        System.out.println(nm2);
                nm2 -= + 2;
        System.out.println(nm2);
                int nm3 = 2147483647;
        System.out.println("int:\n" + nm3);
                nm3++;
        System.out.println(nm3);
                nm3 -= + 2;
        System.out.println(nm3);
                long nm4 = 9223372036854775807L;
        System.out.println("long:\n" + nm4);
                nm4++;
        System.out.println(nm4);
                nm4 -= + 2;
        System.out.println(nm4);
                float nm5 = 3.4e+38f;
        System.out.println("float:\n" + nm5);
                nm5++;
        System.out.println(nm5);
                nm5 -= + 2;
        System.out.println(nm5);
                double nm6 = 1.7e+308;
        System.out.println("double:\n" + nm6);
                nm6++;
        System.out.println(nm6);
                nm6 -= + 2;
        System.out.println(nm6);
                char nm7 = 65535;
        System.out.println("char:\n" + nm7);
                nm7++;
        System.out.println(nm7);
                nm7 -= + 2;
        System.out.println(nm7);
                boolean a = true;
        System.out.println("boolean:\n" + a);

        System.out.println("\n5. Перестановка значений переменных.\n");
                int nmb1 = 2;
                int nmb2 = 5;
                int nmb3 = 3;
        System.out.println("1. С помощью третьей переменной.\n" 
                + "Исходные значения: " + "Переменная № 1 = " 
                + nmb1 + ". Переменная № 2 = " + nmb2);
                nmb1 += nmb3;
                nmb2 -= nmb3;
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + nmb1 +
                ". Переменная № 2 = " + nmb2);
        System.out.println("\n2. С помощью арифметических операций.\n" 
                + "Исходные значения: " + "Переменная № 1 = " 
                + nmb1 + ". Переменная № 2 = " + nmb2);
                nmb1 += nmb2;
                nmb2 = nmb1 - nmb2;
                nmb1 -= nmb2;
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + nmb1 +
                ". Переменная № 2 = " + nmb2);
        System.out.println("\n3. С помощью побитовой операции.\n" 
                + "Исходные значения: " + "Переменная № 1 = " 
                + nmb1 + ". Переменная № 2 = " + nmb2);
        System.out.println("Новые значения переменных: " 
                + "Переменная № 1 = " + Integer.toBinaryString(nmb1) +
                ". Переменная № 2 = " + Integer.toBinaryString(nmb2));

        System.out.println("\n6. Вывод символов и их кодов.\n");
                char num1 = 35;
        System.out.println("35 - " + num1);
                char num2 = 38;
        System.out.println("38 - " + num2);
                char num3 = 64;
        System.out.println("64 - " + num3);
                char num4 = 94;
        System.out.println("94 - " + num4);
                char num5 = 95;
        System.out.println("95 - " + num5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.\n");
                char right = 47;
                char left = 92;
                char bracket_right = 40;
                char bracket_left = 41;
                char trait = 95;
        System.out.println("    " + right + left +
                "\n   " + right + "  " + left + 
                "\n  " + right + trait + bracket_right + 
                " " + bracket_left + left + 
                "\n " + right + "      " + left + 
                "\n" + right + trait + trait + trait + 
                trait + right + left + trait + trait + left);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");
                nmb1 = 123;
        System.out.println("Число " + nmb1 + " содержит :");
                nmb2 = nmb1 / 100;
        System.out.println(nmb2 + " сотню");
                nmb3 = nmb1 / 10;
        System.out.println(nmb3 + " десятков");
                int nmb4 = nmb1 / 1;
        System.out.println(nmb4 + " единицы");
                int numb1 = nmb1%10;
                nmb1 /= 10;
                int numb2 = nmb1%10;
                nmb1 /= 10;
                int numb3 = nmb1%10;
                int sumnumb = numb1 + numb2 + numb3;
                int product = numb1 * numb2 * numb3;
        System.out.println("Сумма цифр = " + sumnumb + 
                "\nПроизведение = " + product);

        System.out.println("\n9. Вывод времени.\n");
                numb1 = 86399;
                int hour = numb1 % 24;
                int minute = numb1 % 60;
                int second = 86399 - (hour * 60 * 60 + (minute * 60));
        System.out.println(hour + ":" + minute + ":" + second);
    }
}