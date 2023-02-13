import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player player1;
    private Player player2;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player1.getName() + " введите ваше число.");
        player1.setNumber(scanner.nextInt());
        if (player1.getNumber() == targetNumber) {
            System.out.println("Игрок " + player1.getName() + " выиграл, это число: " + 
                    player1.getNumber());
        }
        if (player1.getNumber() != targetNumber) {
            System.out.println("Игрок " + player2.getName() + " введите ваше число.");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == targetNumber) {
                System.out.println("Игрок " + player2.getName() + " выиграл, это число: " +
                        player2.getNumber());
            }
        }
        cheking();
    }

    private void cheking() {
        while(player1.getNumber() != targetNumber && player2.getNumber() != targetNumber) {
            if (player1.getNumber() > targetNumber) {
                System.out.println("Число " + player1.getNumber() + " игрока " + player1.getName() +
                        " больше того, что загадал компьютер!");
            } else {
                System.out.println("Число " + player1.getNumber() + " игрока " + player1.getName() +
                        " меньше того, что загадал компьютер!");
            }
            if (player2.getNumber() > targetNumber) {
                System.out.println("Число " + player2.getNumber() + " игрока " + player2.getName() +
                        " больше того, что загадал компьютер!");
            } else {
                System.out.println("Число " + player2.getNumber() + " игрока " + player2.getName() +
                        " меньше того, что загадал компьютер!");
            }
            startgame();
        }
    }
}