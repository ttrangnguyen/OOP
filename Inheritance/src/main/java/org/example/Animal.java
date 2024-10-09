package org.example;

public class Animal {
    //Mức truy cập của biến name là public, biến name có thể được truy cập từ bên bất kỳ đâu,
    //bên ngoài class Animal
    public String name;
    //Mức truy cập của biến food là protected,
    // bên ngoài class Animal, biến food có thể được truy cập từ các lớp con của Animal
    // (có thể cùng hoặc khác package với Animal)
    protected String food;
    //Mức truy cập của biến iD là mặc định (package)
    //iD chỉ có thể truy cập từ các các class trong cùng package với Animal
    //từ class SaoLa, mặc dù là con của Animal, nhưng khác package với Animal, sẽ không thể truy cập được iD
    String iD;
    //Mức truy cập của biến age là private, biến này chỉ có thể truy cập từ clas Animal
    private int age;

    public void eat(){
        System.out.println("Eating " + food);
    }
}
