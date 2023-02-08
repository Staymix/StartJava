public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Crimson Typhoon");
        jaeger1.setMark("Mark-4");
        jaeger1.setNumberOfPilots(3);
        jaeger1.setOrigin("China");
        jaeger1.setHeight(250);
        jaeger1.setWeight(1.722f);
        jaeger1.setSpeed(9);
        jaeger1.setStrength(8);
        System.out.printf("Имя: %s \nМодель: %s \nКоличество пилотов: %d \nПроизводитель: %s"
                + " \nВысота: %d \nВес: %.3f \nСкорость: %d \nСила: %d \n\n", jaeger1.getName(), 
                        jaeger1.getMark(), jaeger1.getNumberOfPilots(), jaeger1.getOrigin(), 
                                jaeger1.getHeight(), jaeger1.getWeight(), jaeger1.getSpeed(), 
                                        jaeger1.getStrength());
        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Mark-1", 2, "Russia", 280, 2.412f, 3, 10);
        System.out.println(jaeger2);
        jaeger1.powerMove();
        jaeger2.go();
        jaeger2.rollOfNickels();
        jaeger1.specialPower();
    }
}