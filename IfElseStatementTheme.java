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
        System.out.println("\nЧисло " + num1 + ":");
        if (num1 == 0) {
            System.out.println("число равно нулю");
        } else if (num1 % 2 == 0) {
            System.out.println("\nявляется четным");
        } else {
            System.out.println("\nявляется не четным");
        } if (num1 > 0) {
            System.out.println("\nявляется положительным");
        } else if (num1 < 0) {
            System.out.println("\nявляется отрицательным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        num1 = 153;
        num2 = 103;
        System.out.println("\nИсходные числа " + num1 + " и " + num2);
        if (num1 / 100 == num2 / 100) {
            System.out.println("Одинаковые числа в 3 разряде : " + num1 / 100);
        }
        if (num1 % 100 / 10 == num2 % 100 / 10) {
            System.out.println("Одинаковые числа во 2 разряде : " + num1 % 100 / 10);
        }
        if (num1 % 10 == num2 % 10) {
            System.out.println("Одинаковые числа в 1 разряде : " + num1 % 10);
        }
        else {
            System.out.println ("Одинаковых чисел нет.");
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
        int GradePointAverage = 0;
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
        int billUSD1 = 50;
        int billUSD10 = 5;
        int billUSD100 = 10;
        int sumUSD = 567;
        int sumUSDHundred = sumUSD / 100;
        int sumUSDtens = sumUSD / 10;
        int sumUSDones = 0;
        boolean isEnough = ((billUSD100 * 100) + (billUSD10 * 10) + billUSD1) < sumUSD;
        if (isEnough) {
            System.out.println("Недостаточно банкнот.");
        } else if(sumUSDHundred <= billUSD100 && sumUSDHundred > 0) {
            sumUSD = sumUSD - (sumUSDHundred * 100);
            billUSD100 = billUSD100 - sumUSDHundred;
            System.out.println("Банкноты номиналом по 100 USD в количестве " + 
                    sumUSDHundred + " шт ");
        } else {
            System.out.println("Банкноты номиналом по 100 USD в количестве " + billUSD100 + " шт");
            sumUSD = sumUSD - (billUSD100 * 100);
        }
        if (sumUSDtens <= billUSD10 && !isEnough) {
            billUSD10 = billUSD10 - sumUSDtens;
            System.out.println("Банкноты номиналом по 10 USD в количестве " + sumUSDtens + " шт");
            sumUSD = sumUSD - (sumUSDtens * 10);
        } else if (!isEnough) {
            sumUSDtens = sumUSDtens - (sumUSDtens - billUSD10);
            System.out.println("Банкноты номиналом по 10 USD в количестве " + billUSD10 + " шт");
            sumUSD = sumUSD - (billUSD10 * 10);
        }
        if (sumUSD <= billUSD1 && !isEnough) {
            billUSD1 = billUSD1 - sumUSD;
            System.out.println("Банкноты номиналом по 1 USD в количестве " + sumUSD + " шт");
            sumUSDones = sumUSD;
            sumUSD -= sumUSD;
        } else if (!isEnough) {
            sumUSD -= billUSD1;
            System.out.println("Банкноты номиналом по 1 USD в количестве " + billUSD1 + " шт");
        }
        if (sumUSD == 0) {
            System.out.println("Купюры выданы на общую сумму " + (sumUSDones + ((sumUSDtens * 10) + 
                    (sumUSDHundred * 100))) + " USD");
        } else {
            System.out.println("Произошла ошибка");
        }
    }
}