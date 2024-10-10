package org.example;

public class Cat extends Animal implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}