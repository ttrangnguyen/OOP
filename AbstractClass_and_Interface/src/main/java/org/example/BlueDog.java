package org.example;


//Animal là lớp abtract
//Dog là lớp abstract
//Dog kết thừa Animal và cài đặt interface Pet
//BlueDog là lớp cụ thể, BlueDog kế thừa Dog
//BlueDog là lớp cụ thể đầu tiên trong cây kế thừa.
// Do đó, BlueDog cần override tất cả các phương thức abstract (chưa được cài đặt) mà nó được kế thừa
//Ví dụ: Animal có phương thức makeNoise() abstract, Pet có phương thức beFriendly() và play() abstract
//Phương thức beFriendly() và play() đã được cài đặt bởi Dog, BlueDog có thể override hoặc không
//phương thức makeNoise() chưa được cài đặt bởi Dog, BlueDog bắt buộc phải override nếu không trình biên dịch sẽ báo lỗi
public class BlueDog extends Dog{

    @Override
    public void makeNoise() {
        System.out.println("Blue Dog is making noise");
    }

    public void foo(){
        System.out.println("This is a specific method of Blue Dog");
    }
}
