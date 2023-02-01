public class Calculator {
    public static void main(String[] args) {
        int numberOne = 1236;
        int numberTwo = 78;
        int result = 0;
        char sign = '^';
        if (sign == '*') {
            result = numberOne * numberTwo;
        } else if (sign == '+') {
            result = numberOne + numberTwo;
        } else if (sign == '-') {
            result = numberOne - numberTwo;
        } else if (sign == '/') {
            result = numberOne / numberTwo;
        } else if (sign == '^') {
            for (int i = numberTwo; i > 0; i--) {
                int counter = numberOne * numberOne;
                result += counter;
            }
        } else if (sign == '%') {
            result = (numberOne / 100) * numberTwo;
        }
        System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + result);
    }
}