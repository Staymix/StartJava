import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player player1;
    private Player player2;
    private int numberPlayer;
    private String namePlayer;
    private boolean right = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        targetNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Я загадал число от 1 до 100!");
        startgame();
    }

    public void startgame() {
        do {
            Scanner scanner = new Scanner(System.in);
            namePlayer = player1.getName();
            System.out.println("Игрок " + namePlayer + " введите ваше число.");
            player1.setNumber(scanner.nextInt());
            numberPlayer = player1.getNumber();
            isGuessed();
            if (right) {
                break;
            }
            namePlayer = player2.getName();
            System.out.println("Игрок " + namePlayer + " введите ваше число.");
            player2.setNumber(scanner.nextInt());
            numberPlayer = player2.getNumber();
            isGuessed();
        } while (!right);
    }

    private boolean isGuessed() {
        if (numberPlayer == targetNumber) {
            System.out.println("Игрок " + namePlayer + " выиграл, это число: " + targetNumber);
            right = true;
        } else if (numberPlayer > targetNumber) {
                System.out.println("Число " + numberPlayer + " игрока " + namePlayer +
                        " больше того, что загадал компьютер!");
        } else {
                System.out.println("Число " + numberPlayer + " игрока " + namePlayer +
                        " меньше того, что загадал компьютер!");
        }
        return right;
    }
}