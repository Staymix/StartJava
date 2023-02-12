public class GuessNumber {
    private int numberp1;
    private int numberp2;
    private int targetNumber;
    private Player p1;
    private Player p2;

    public GuessNumber(Player player1, Player player2) {
        p1 = player1;
        p2 = player2;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void guessComputer() {
        targetNumber = (int) (Math.random() * 101);
        System.out.println("Я загадываю число от 0 до 100!");
    }

    public void startgame() {
        p1.setNumber((int) (Math.random() * 101));
        numberp1 = p1.getNumber();
        if (numberp1 == targetNumber) {
            System.out.println("Игрок " + p1.getName() + " игрок выйграл, это число: " + numberp1);
        }
        if (numberp1 != targetNumber) {
            p2.setNumber((int) (Math.random() * 101));
            numberp2 = p2.getNumber();
            if (numberp2 == targetNumber) {
                System.out.println("Игрок " + p2.getName() + " игрок выйграл, это число: " +
                        numberp2);
            }
        }
        cheking();
    }

    private void cheking() {
        while(numberp1 != targetNumber && numberp2 != targetNumber) {
            if (numberp1 > targetNumber) {
                System.out.println("Число " + numberp1 + " игрока " + p1.getName() +
                        " больше того, что загадал компьютер!");
            }
            if (numberp2 > targetNumber) {
                System.out.println("Число " + numberp2 + " игрока " + p2.getName() +
                        " больше того, что загадал компьютер!");
            }
            if (numberp1 < targetNumber) {
                System.out.println("Число " + numberp1 + " игрока " + p1.getName() +
                        " меньше того, что загадал компьютер!");
            }
            if (numberp2 < targetNumber) {
                System.out.println("Число " + numberp2 + " игрока " + p2.getName() +
                        " меньше того, что загадал компьютер!");
            }
            startgame();
            break;
        }
    }
}