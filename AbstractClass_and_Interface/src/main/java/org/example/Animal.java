package org.example;


//Chúng ta không rõ một đối tượng Animal sẽ trông như thế nào. Do đó, chúng ta không muốn chương trình tạo ra các đối tượng Animal
//Lớp Animal được khai báo là lớp trừu tượng với từ khoá "abstract"
//Các lớp trừu tượng vẫn có thể sử dụng là một kiểu của tham chiếu nhưng không thể khởi tạo đối tượng
//Ví dụ nếu khai báo Animal a = new Animal(); trình biên dịch sẽ báo lỗi
public abstract class Animal {

    public String name;
    protected String food;
    String iD;
    private int age;
    public int num_legs;

    public void eat(){
        System.out.println("Eating " + food);
    }

    //phương thức makeNoise là phương thức trừu tượng (abstract)
    //phương thức trừu tượng không có thân hàm
    //lớp trừu tượng có thể có (hoặc không có) phương thức trừu tượng
    //nhưng phương thức trừu tượng bắt buộc phải đặt trong một lớp trừu tượng
    //chúng ta không thể khai báo makeNoise() là phương thức abstract nhưng không khai báo abstract với class Animal
    public abstract void makeNoise();

}
