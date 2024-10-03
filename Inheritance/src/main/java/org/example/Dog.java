package org.example;

public class Dog extends Animal{

    //Dog là lớp con của Animal
    //Dog có các thành phần (thuộc tính và phương thức) mà Animal khai báo
    //Dog thực hiện cài đè (override) phương thức eat
    public void eat(){
        System.out.println("Dog " + name +
                " is eating " + food);
    }

    //Dog có các phương thức của riêng nó mà Animal không có
    public void bark(){
        System.out.println("Dog is barking");
    }
}
