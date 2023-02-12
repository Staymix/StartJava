import java.util.Scanner;
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber start = new GuessNumber(player1, player2);
        start.guessComputer();
        start.startgame();
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            String answer = scanner.nextLine().toLowerCase();
            if ("no".equals(answer)) {
                break;
            } else if ("yes".equals(answer)) {
                start.guessComputer();
                start.startgame();
            }
        } while (true);
    }
}