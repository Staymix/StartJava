public class Calculator {
    private int number1;
    private int number2;
    private char sign;
    private int result;

    void setNumber1(int number1) {
        this.number1 = number1;
    }

    void setNumber2(int number2) {
        this.number2 = number2;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    public void doComputing() {
        switch(sign) {
            case '*' :
                result = number1 * number2;
                break;
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < number2; i++) {
                result *= number1;
            }
                break;
            case '%' :
                result = number1 % number2;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}