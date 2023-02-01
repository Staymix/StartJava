public class MyFirstGame {
    public static void main(String[] args) {
        int playNumber = 50;
        int compyterNumber = 60;
        while (playNumber != compyterNumber) {
            if (playNumber > compyterNumber) {
                System.out.println("Число " + playNumber + " больше того, что загадал компьютер");
                playNumber--;
            } else if (playNumber < compyterNumber) {
                System.out.println("Число " + playNumber + " меньше того, что загадал компьютер");
                playNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}