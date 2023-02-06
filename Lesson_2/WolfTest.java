public class WolfTest {
    public static void  main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Пол - " + wolfOne.gender + "\nКличка - " + wolfOne.name + "\nВес - " +
                wolfOne.weight + "\nВозраст - " + wolfOne.age + "\nЦвет - " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}