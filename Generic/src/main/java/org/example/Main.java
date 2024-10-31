package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //p1 là một tham chiếu tới đối tượng kiểu Pair
        //Trong trường hợp này T trong khai báo của lớp Pair sẽ được thay thế bằng Integer
        //U trong khai báo của lớp Pair sẽ được thay thế bằng String
        Pair<Integer, String> p1 = new Pair<>(new Integer(1), new String("a"));

        //p2 là một tham chiếu tới đối tượng kiểu Pair
        //Trong trường hợp này T trong khai báo của lớp Pair sẽ được thay thế bằng String
        //U trong khai báo của lớp Pair sẽ được thay thế bằng Integer
        Pair<String, Integer> p2 = new Pair<>(new String("a"), new Integer(1));

        //p3 là một tham chiếu tới đối tượng kiểu Pair
        //Trong trường hợp này T trong khai báo của lớp Pair sẽ được thay thế bằng String
        //U trong khai báo của lớp Pair sẽ được thay thế bằng Integer
        //Nếu uncomment dòng 24 chương trình sẽ lỗi, vì tham số thứ nhất phải là Kiểu String,
        // nhưng đối số truyền vào lại là kiểu Integer (Không tương thích)
//        Pair<String, Integer> p3 = new Pair<>(new Integer(1), new Integer(2));

        A a = new A();
        Integer[] int_array = {1, 2, 3};
        //getMiddle trong trường hợp này có tham số kiểu là Integer
        a.<Integer>getMiddle(int_array);

//        ArrayList<String> string_list =
//                new ArrayList<String>();
//        string_list.add(new String("a"));
//

//
//        Integer f = p.getFirst();
//


        ArrayList<Animal> arr = new ArrayList<>();
        arr.add( new Animal());
        arr.add(new Dog());
        //printList có thể nhận đầu vào là một ArrayList với tham số kiểu là Animal hoặc con của Animal
        //Do đó, printList có thể nhận vào tham số arr (khai báo ở dòng 42)
        printList(arr);
        //Vì arr là ArrayList có kiểu tham số là Animal, nên nó có thể truyền vào phương thức printListWithoutWildCard
        printListWithoutWildCard(arr);

        ArrayList<Dog> dog_arr = new ArrayList<>();
        dog_arr.add(new Dog());
        //printList có thể nhận đầu vào là một ArrayList với tham số kiểu là Animal hoặc con của Animal
        //Do đó, printList có thể nhận vào tham số dog_arr (khai báo ở dòng 48)
        printList(dog_arr);
        //Vì dog_arr không phải là ArrayList có kiểu tham số là Animal (kiểu tham số của nó là Dog)
        // nên nó không thể truyền vào phương thức printListWithoutWildCard
        //uncomment dòng 58 chương trình sẽ lỗi
//        printListWithoutWildCard(dog_arr);

        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(10);
        int_list.add(4);
        int_list.add(7);
        int_list.add(2);
        System.out.println(int_list);
        //Collections của Java cung cấp cho chúng ta rất nhiều tiện ích
        //Ví dụ: sắp xếp một danh sách như lời gọi ở dòng 68
        //Integer là kiểu dữ liệu cơ bản, việc so sánh các số nguyên Java đã cài đặt giúp bạn
        Collections.sort(int_list);
        System.out.println(int_list);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("s", 10));
        animals.add(new Animal("b", 7));
        animals.add(new Animal("c", 4));
        System.out.println(animals);
        //Để có thể sắp xếp được một danh sách các đối tượng thuộc kiểu do người dùng cài đặt (trong trường hợp này là kiểu Animal)
        //Kiểu đó phải có thể so sánh được (vì Collections.sort cần so sánh các đối tượng để sắp xếp).
        //Cụ thể lớp Animal phải cài đặt interface Comparable và override phương thức compareTo
        //Chi tiết về cài đặt lớp Animal xem trong file Animal.java
        //Nếu lớp Animal không implement interface và không override compareTo, dòng 82 sẽ lỗi
        Collections.sort(animals);
        System.out.println(animals);


    }

    //Kí tự đại diện ? cho phép phương thức printList nhận vào một ArrayList
    // chứa các đối tượng thuộc bất kỳ kiểu nào tương thích với Animal (Kiểu Animal hoặc con của Animal)
    public static void printList(ArrayList<? extends Animal> arr){
        for(Animal a: arr){
            System.out.println("animal");
        }
    }

    //Không có quan hệ kế thừa trong tổng quát hoá
    //Do đó, nếu không khai báo sử dụng ký tự đại diện (xem phương thức printList),
    // phương thưc printListWithoutWildCard chỉ có thể nhận vào các ArrayList có kiểu tham số là Animal
    public static void printListWithoutWildCard(ArrayList<Animal> arr){
        for(Animal a: arr){
            System.out.println("animal");
        }
    }

}

