public class WolfTest {
    public static void  main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Самка");
        wolfOne.setName("Джетта");
        wolfOne.setWeight(30);
        wolfOne.setAge(10);
        wolfOne.setColor("Белый");
        System.out.println("Пол - " + wolfOne.gender + "\nКличка - " + wolfOne.name + "\nВес - " +
                wolfOne.weight + "\nВозраст - " + wolfOne.age + "\nЦвет - " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}