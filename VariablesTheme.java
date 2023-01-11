public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.\n");
            byte dDDR4 = 8;
        System.out.println("DDR4 " + dDDR4 + " GB");
            short intel = 64;
        System.out.println("Intel " + intel);
            int geForce = 940;
        System.out.println("GeForce " + geForce);
            long hDD_mb = 1000000L;
        System.out.println("HDD " + hDD_mb + " mb");
            float ghz = 2.3f;
        System.out.println("Ghz " + ghz);
            double version = 1.03d;
        System.out.println("Version " + version);
            char model = 'V';
        System.out.println("Model " + model);

        System.out.println("\n2. Расчет стоимости товара со скидкой.\n");
            int pen_price = 100;
            int book_price = 200;
            int sum_price = pen_price + book_price;
            int sum_diskount = (sum_price / 100) * 11;
            int price_diskount = sum_price - sum_diskount;
        System.out.println("i. Сумма скидки " + sum_diskount
                +  "\nii. Общая стоимость товаров со скидкой " + price_diskount);

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("    J   a  v     v  a   \n" + 
                "    J  a a  v   v  a a\n" + 
                        " J  J aaaaa  V V  aaaaa\n" + 
                                "  JJ a     a  V  a     a\n");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.\n");
        dDDR4 = 127;
        System.out.println("byte:\n" + dDDR4);
        dDDR4 ++;
        System.out.println(dDDR4);
        dDDR4 -= + 2;
        System.out.println(dDDR4);
        intel = 32767;
        System.out.println("short:\n" + intel);
        intel ++;
        System.out.println(intel);
        intel -= + 2;
        System.out.println(intel);
        geForce = 2147483647;
        System.out.println("int:\n" + geForce);
        geForce ++;
        System.out.println(geForce);
        geForce -= + 2;
        System.out.println(geForce);
        hDD_mb = 9223372036854775807L;
        System.out.println("long:\n" + hDD_mb);
        hDD_mb ++;
        System.out.println(hDD_mb);
        hDD_mb -= + 2;
        System.out.println(hDD_mb);
        ghz = 3.4e+38f;
        System.out.println("float:\n" + ghz);
        ghz ++;
        System.out.println(ghz);
        ghz -= + 2;
        System.out.println(ghz);
        version = 1.7e+308;
        System.out.println("double:\n" + version);
        version ++;
        System.out.println(version);
        version -= + 2;
        System.out.println(version);
        System.out.println("double:\n" + model);
        model ++;
        System.out.println(model);
        model -= + 2;
        System.out.println(model);
        boolean a = true;
        System.out.println("boolean:\n" + a);

        System.out.println("\n5. Перестановка значений переменных.\n");
        geForce = 2;
        int geForce2 = 5;
        System.out.println("1. С помощью третьей переменной.\n" 
                 + "Исходные значения: " + "Переменная № 1 = " 
                 + geForce + ". Переменнная № 2 = " + geForce2);
        int geForce3 = 3;
        geForce += geForce3;
        geForce2 -= geForce3;
        System.out.println("Новые значения переменных: " 
                  + "Переменнная № 1 = " + geForce +
                  ". Переменая № 2 = " + geForce2);
        System.out.println("\n2. С помощью арифметических операций.\n" 
                 + "Исходные значения: " + "Переменная № 1 = " 
                 + geForce + ". Переменнная № 2 = " + geForce2);
        geForce += geForce2;
        geForce2 = geForce - geForce2;
        geForce -= geForce2;
         System.out.println("Новые значения переменных: " 
                  + "Переменнная № 1 = " + geForce +
                  ". Переменая № 2 = " + geForce2);
         System.out.println("\n3. С помощью побитовой операции.\n" 
                 + "Исходные значения: " + "Переменная № 1 = " 
                 + geForce + ". Переменнная № 2 = " + geForce2);
         System.out.println("Новые значения переменных: " 
                  + "Переменнная № 1 = " + Integer.toBinaryString(geForce) +
                  ". Переменая № 2 = " + Integer.toBinaryString(geForce2));

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
          geForce = 123;
          System.out.println("Число " + geForce + " содержит :");
          geForce2 = geForce / 100;
          System.out.println(geForce2 + " сотню");
          geForce3 = geForce / 10;
          System.out.println(geForce3 + " десятков");
          int geForce4 = geForce / 1;
          System.out.println(geForce4 + " единицы");
          int numb1 = geForce%10;
          geForce /= 10;
          int numb2 = geForce%10;
          geForce /= 10;
          int numb3 = geForce%10;
          int sumnumb = numb1 + numb2 + numb3;
          int product = numb1 * numb2 * numb3;
          System.out.println("Сумма цифр = " + sumnumb + 
                  "\nПроизведение = " + product);

          System.out.println("\n9. Вывод времени.\n");
          numb1 = 86399;
          int hour = numb1%24;
          int minute = numb1%60;
          int second = 86399 - (hour * 60 * 60 + (minute * 60));
          System.out.println(hour + ":" + minute + ":" + second);
    }
}