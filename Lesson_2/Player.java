public class Player {
    private String name;
    private int number;
    private String answer;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void guess () {
        number = (int) (Math.random() * 101);
        System.out.println("Думаю, это число " + number);
    }

    public int getNumber() {
        return number;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}