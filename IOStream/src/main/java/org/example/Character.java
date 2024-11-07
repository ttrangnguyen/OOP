package org.example;

import java.io.Serializable;

//Character là lớp con của A
//A không implements Serializable
//Nhưng Character có thể implement Serializable
//Khi deseriablize một đối tượng Character (load dữ liệu từ file vào tạo lại đối tượng trên bộ nhớ heap)
//Constructor của Charactor không được gọi, các thuộc tính của Character được gán bằng các giá trị được lưu lại trong file
//Tuy nhiên với các giá trị của thuộc tính do A khi báo không được lưu lại (do A không implement Serializable),
// JVM sẽ gọi constructor của A để khởi tạo giá trị cho các thuộc tính này
public class Character extends A implements Serializable{

    private int power = 1;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void increasePower(){
        power = power*2;
//        a = power;
    }
    public void increaseAge(){
        age += 1;
    }
}
