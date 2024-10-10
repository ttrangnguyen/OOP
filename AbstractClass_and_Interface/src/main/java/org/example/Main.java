package org.example;

import hospital.Hospital;

public class Main {
    public static void main(String[] args) {

        BlueDog bd = new BlueDog();
        bd.food = "BlueDog_food";
        bd.name = "Tom";
        bd.makeNoise();
        bd.foo();

        //up casting là nhìn nhận đối tượng lớp con như là một đối tượng lớp cha
        Animal a = bd;
        //Chúng ta dùng a để tham chiếu tới đối tượng BlueDog
        //Do đó, chúng ta chỉ có thể tương tác với BlueDog thông qua những phương thức mà Animal có
        //Thông qua tham chiếu a, đối tượng BlueDog tạm thời mất đi các hành vi chuyên biệt của nó
        //Ví dụ ta không thể gọi a.foo();
        //Vì trình biên dịch sẽ kiểm tra Animal (kiểu của tham chiếu a) không có phương thức foo
        //Do đó, nó báo lỗi.
        //enable dòng 21, chương trình sẽ lỗi
        //a.foo();

        //down casting là nhìn nhận đối tượng lớp cha như là một đối tượng lớp con
        //down casting cần ép kiểu tường minh
        BlueDog bd1 = (BlueDog) a;

        //thực chất a là một tham chiếu kiểu Animal.
        //Do đó, a có thể tham chiếu tới bất kỳ đối tượng nào thuộc kiểu con của Animal, ví dụ Dog, Cat, ...
        //Nếu đối tượng mà a đang tham chiếu tới không phải là đối tượng BlueDog,
        //việc down casting sẽ bị lỗi.
        //Để ngăn chặn lỗi xảy ra,
        // cần kiểm tra đối tượng thực sự mà a đang tham chiếu tới có phải là BlueDog không trước khi down casting
        a = new Cat();
        if (a instanceof BlueDog){
            //câu lệnh dòng 39 sẽ không diễn ra,
            // do điều kiện dòng 34 không thoả mãn
            //a đang tham chiếu tới một đối tượng Cat (dòng 33) không phải BlueDog
            //Nếu xoá bỏ dòng 34, code này sẽ bị lỗi
            bd1 = (BlueDog) a;
        }

        //Interface mang lại cho chúng ta lợi ích về đa hình giống như lớp cha (superclass)
        Pet pet_list[] = new Pet[2];
        pet_list[0] = new Cat();
        pet_list[1] = new BlueDog();

        for(Pet p:pet_list){
            p.beFriendly();
            p.play();
        }

        Hospital h = new Hospital();
        h.inject(bd);
        h.inject(a);

        //Enable dòng 59 có code chạy có lỗi không?vì sao?
        //h.inject(p[0]);

        for(Pet p:pet_list){
            h.special_treatment(p);
        }

    }
}