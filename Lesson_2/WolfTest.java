public class WolfTest {
    public static void  main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Самец";
        wolfOne.name = "Рекс";
        wolfOne.weight = 40;
        wolfOne.age = 10;
        wolfOne.color = "Серый";
        System.out.println("Пол - " + wolfOne.gender + "\nКличка - " + wolfOne.name + "\nВес - " +
                wolfOne.weight + "\nВозраст - " + wolfOne.age + "\nЦвет - " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}