package org.example;

import java.io.Serializable;

public class Game implements Serializable { ;
    private int score = 0;
    Character character = new Character();
    //Khi nén và lưu đối tượng Game, các thuộc tính của Game gồm có score, character, và b sẽ được lưu
    //character và b là các tham chiếu đối tượng, khi đó, các đối tượng mà các tham chiếu này trỏ tới sẽ được tự động lưu lại.
    //Trong một số trường hợp có một số giá trị chúng ta không muốn lưu lại, ví dụ các giá trị nhạy cảm như Password
    //Để bỏ qua việc lưu một thuộc tính chúng ta khai báo transient trước thuộc tính đó.
    //Như vậy, nếu khai báo như trong file này, chỉ có score và đối tượng tham chiếu bởi character được lưu
    //Khi deseriablize đối tượng Game, các thuộc tính được khai báo transient sẽ có trị null
    // (vì khi lưu đối tượng chúng ta không lưu lại giá trị của các thuộc tính này)
    transient B b = new B();
    public Character getCharacter() {
        return character;
    }

    public void addScore(int x){
        score += x;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }




}