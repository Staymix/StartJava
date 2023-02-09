import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            calculator.doComputing();
            scanner.nextLine();
            do {
                System.out.println("\nХотите продолжить вычисления?[yes/no] :");
                answer = scanner.nextLine();
            } while(!"no".equalsIgnoreCase(answer) & !"yes".equalsIgnoreCase(answer));
        } while (!"no".equalsIgnoreCase(answer));
    }
}