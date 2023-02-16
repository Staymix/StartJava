package com.startjava.lesson_2_3.person;

public class Person {
    String gender = "Мужчина";
    String name = "Вася";
    int heigth = 170;
    int weigth = 80;
    int age = 30;

    void move() {
        System.out.println("Вы идете.");
    }

    void sit() {
        System.out.println("Вы сели.");
    }

    void run() {
        System.out.println("Вы бежите.");
    }

    void say() {
        System.out.println("Вы говорите.");
    }
    
    void learnJava() {
        System.out.println("Вы учите Java.");
    }
}