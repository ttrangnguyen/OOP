package org.example;


//Dog là một lớp kế thừa Animal và cài đặt interface Pet
//Do đó, Dog có các phương thức của Animal và Pet
//Chúng ta chỉ có thể extends tối đa 1 lớp
//nhưng có thể implements nhiều interface
public abstract class Dog extends Animal implements Pet{

    public void eat(){
        System.out.println("Dog " + name +
                " is eating " + food);
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
