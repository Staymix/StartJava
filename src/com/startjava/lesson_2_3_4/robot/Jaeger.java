package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String name;
    private String mark;
    private int numberOfPilots;
    private String origin;
    private int height;
    private float weight;
    private int speed;
    private int strength;

    public Jaeger(){
    }

    public Jaeger(final String name, String mark, int numberOfPilots, String origin, int height, 
            float weight, int speed, int strength) {
        this.name = name;
        this.mark = mark;
        this.numberOfPilots = numberOfPilots;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
    }

    public String toString() {
        return String.format("Имя: %s \nМодель: %s \nКоличество пилотов: %d \nПроизводитель: %s"
                + " \nВысота: %d \nВес: %.3f \nСкорость: %d \nСила: %d", name, mark, numberOfPilots,
                        origin, height, weight, speed, strength);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void powerMove() {
        System.out.println("Силовой прием.");
    }

    public void go() {
        System.out.println("Движение.");
    }

    public void rollOfNickels() {
        System.out.println("Увеличенная сила удара.");
    }

    public void specialPower() {
        System.out.println("Увеличенаня скорость движения.");
    }
}