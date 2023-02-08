import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("Введите имя первого игрока: ");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player p2 = new Player(scanner.nextLine());
        int p1number = 0;
        int p2number = 0;
        do {
            int targetNumber = (int) (Math.random() * 101);
            System.out.println("Я загадываю число от 0 до 100!");
            p1.guess();
            p1number = p1.getNumber();
            if (p1number == targetNumber) {
                System.out.println("Игрок " + p1.getName() + " игрок выйграл, это число: " +
                        p1number);
                do {
                    System.out.println("Хотите продолжить игру? [yes/no]");
                    p1.setAnswer(scanner.nextLine());
                    if ("no".equalsIgnoreCase(p1.getAnswer()) || 
                            "yes".equalsIgnoreCase(p1.getAnswer())) {
                        break;
                    }
                } while (true);
            }
            if (p1number != targetNumber) {
                p2.guess();
                p2number = p2.getNumber();
                if (p2number == targetNumber) {
                    System.out.println("Игрок " + p2.getName() + " игрок выйграл, это число: " +
                            p2number);
                    do {
                        System.out.println("Хотите продолжить игру? [yes/no]");
                        p1.setAnswer(scanner.nextLine());
                        if ("no".equalsIgnoreCase(p1.getAnswer()) || 
                                "yes".equalsIgnoreCase(p1.getAnswer())) {
                            break;
                        }
                    } while (true);
                }
            }
            if (p1number != targetNumber && p1number != targetNumber) {
                if (p1number > targetNumber) {
                    System.out.println("Число " + p1number + " игрока " + p1.getName() +
                        " больше того, что загадал компьютер!");
                }
                if (p2number > targetNumber) {
                    System.out.println("Число " + p2number + " игрока " + p2.getName() +
                            " больше того, что загадал компьютер!");
                }
                if (p1number < targetNumber) {
                    System.out.println("Число " + p1number + " игрока " + p1.getName() +
                            " меньше того, что загадал компьютер!");
                }
                if (p2number < targetNumber) {
                    System.out.println("Число " + p2number + " игрока " + p2.getName() +
                        " меньше того, что загадал компьютер!");
                }
            }
        } while (!"no".equalsIgnoreCase(p1.getAnswer()));
    }
}