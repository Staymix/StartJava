public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 27;
        boolean maleGender = false;
        float hight = 1.88f;
        char firstLetter = "Stas".charAt(0);
        if (age > 20) {
            System.out.println("Тебе больше 20 лет.");
        } else {
            System.out.println("Тебе 20 лет или меньше.");
        }
        if (!maleGender) {
            System.out.println("Ты мужского пола.");
        } else {
            System.out.println("Ты женского пола.");
        }
        if (hight > 1.8) {
            System.out.println("Твой рост больше 180 см.");
        } else {
            System.out.println("Твой рост 180 см или меньше.");
        }
        if (firstLetter == 'M') {
            System.out.println("Твое имя начинается с буквы М.");
        } else if (firstLetter == 'I') {
            System.out.println("Твое имя начинается с буквы I.");
        } else {
            System.out.println("Твое имя не начинается с буквы M или I.");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 10;
        int num2 = 100;
        if (num1 > num2) {
            System.out.println("Число max " + num1 + ", число min " + num2);
        } else if (num1 < num2) {
            System.out.println("Число max " + num2 + ", число min " + num1);
        } else {
            System.out.println("Число " + num1 + " число " + num2 + " равны.");
        }

        System.out.println("\n3. Проверка чисел.");
        System.out.println("\nЧисло " + num1 + " является:");
        if (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("не четным");
            }
            if (num1 > 0) {
                System.out.println("положительным");
            } else {
                System.out.println("отрицательным");
            }
        } else {
            System.out.print("нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        num1 = 123;
        num2 = 124;
        boolean equalHundread = num1 / 100 == num2 / 100;
        boolean equalTens = num1 / 10 % 10 == num2 / 10 % 10;
        boolean equalOnes = num1 % 10 == num2 % 10;
        System.out.println("\nИсходные числа " + num1 + " и " + num2);
        if (equalHundread || equalTens || equalOnes) {
            if (equalHundread) {
                System.out.println("Одинаковые цифры в 3 разряде : " + num1 / 100);
            }
            if (equalTens) {
                System.out.println("Одинаковые цифры во 2 разряде : " + num1 % 100 / 10);
            }
            if (equalOnes) {
                System.out.println("Одинаковые цифры в 1 разряде : " + num1 % 10);
            }
        } else {
            System.out.println ("Одинаковых цифр нет.");
        }

        System.out.println("\n5. Определение символа по его коду.");
        char symbol = '\u0057';
        System.out.print(symbol);
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.print(" большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.print(" цифра");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.print(" маленькая буква");
        } else {
            System.out.print(" символ");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float depositSum = 300000f;
        float accruedInterest = depositSum * 0.1f;
        if (depositSum < 100000) {
            accruedInterest = depositSum * 0.05f;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            accruedInterest = depositSum * 0.07f;
        }
        System.out.println("Сумма вклада " + depositSum + "\nНачисленный процент " + 
                accruedInterest + "\nИтоговая сумма с % " + (depositSum + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int histroryPercent = 59;
        int programmingPercent = 91;
        int histroryGrade = 5;
        int programmingGrade = 5;
        if (histroryPercent <= 60) {
            histroryGrade = 2;
        } else if (histroryPercent > 60 && histroryPercent <= 73) {
            histroryGrade = 3;
        } else if (histroryPercent > 73 && histroryPercent <= 91) {
            histroryGrade = 4;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }
        System.out.println("История " + histroryGrade + "\nПрограммирование " + programmingGrade + 
                "\nСредний балл оценок по предметам " + ((histroryGrade + programmingGrade) / 2) + 
                "\nСредний процент по предметам " + (histroryPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли за год");
        int sumOfficeRent = 5000;
        int sumSalesAmount = 13000;
        int productionCosts = 9000;
        int sumAnnualProfit = (sumSalesAmount - (sumOfficeRent + productionCosts)) * 12;
        if (sumAnnualProfit > 0) {
            System.out.println("прибыль за год: +" + sumAnnualProfit);
        } else {
            System.out.println("прибыль за год: " + sumAnnualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int bill1UsdInAtm = 50;
        int bill10UsdInAtm = 5;
        int bill100UsdInAtm = 10;
        int sumOfRefund = 567;
        int sumUSD100 = sumOfRefund / 100;
        int sumUSD10 = sumOfRefund / 10 % 10;
        int sumUSD1 = 0;
        System.out.println("Требуемая сумма " + sumOfRefund + " USD");
        if (((bill100UsdInAtm * 100) + (bill10UsdInAtm * 10) + bill1UsdInAtm) >= sumOfRefund) {
            if (sumUSD100 <= bill100UsdInAtm) {
                sumOfRefund = sumOfRefund - (sumUSD100 * 100);
            } else {
                sumOfRefund -= bill100UsdInAtm * 100;
                sumUSD100 = bill100UsdInAtm;
            }
            if (sumUSD10 <= bill10UsdInAtm) {
                sumOfRefund -= sumUSD10 * 10;
            } else {
                sumUSD10 = bill10UsdInAtm;
                sumOfRefund -= bill10UsdInAtm * 10;
            }
            if (sumOfRefund <= bill1UsdInAtm) {
                sumUSD1 = sumOfRefund;
                sumOfRefund -= sumOfRefund;
            } else {
                sumOfRefund -= bill1UsdInAtm;
                sumUSD1 = sumOfRefund;
            }
            if (sumOfRefund == 0) {
            System.out.println("Номинал банкнот 100 USD " + sumUSD100 + 
                    "шт.\nНоминал банкнот 10 USD " + sumUSD10 + "шт.\nНоминал банкнот 1 USD " + 
                    sumUSD1 + "шт.\nКупюры выданы на общую сумму " + (sumUSD1 + 
                    ((sumUSD10 * 10) + (sumUSD100 * 100))) + " USD");
            } else {
                System.out.println("Произошла ошибка");
            }
        } else { 
            System.out.println("Недостаточно банкнот.");
        }
    }
}