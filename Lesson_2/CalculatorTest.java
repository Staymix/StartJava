import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            calculator.calculation();
                do {
                    scanner.nextLine();
                    System.out.println("\nХотите продолжить вычисления?[yes/no] :");
                    calculator.setAnswer(scanner.nextLine());
                    if ("no".equalsIgnoreCase(calculator.getAnswer()) || 
                            "yes".equalsIgnoreCase(calculator.getAnswer())) {
                        break;
                    } else {
                        continue;
                    }
                } while(true);
        } while (!"no".equalsIgnoreCase(calculator.getAnswer()));
    }
}