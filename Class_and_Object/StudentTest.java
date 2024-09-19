public class StudentTest {
    public static void main(String[] args){

        //Khai báo tham chiếu s1 kiểu Student (tạm gọi là đối tượng s1 kiểu Student)
        //s1 tham chiếu tới một đối tượng Student được lưu trong Heap
        Student s1 = new Student();
        System.out.println("S1 age = " + s1.getAge());

        s1.setAge(18);
        s1.setStudentID("ID123");
        s1.printInfo();

        Student s2 = new Student(19, "ID125");
        s2.printInfo();

        //Copy giá đang lưu trên s2 sang s1
        //nói 1 cách khác, sau câu lệnh này s1 và s2
        // sẽ cùng tham chiếu tới một đối tượng
        s1 = s2;
        s1.printInfo();
        s2.printInfo();


        //a là biến địa phương
        //với biến địa phương phải khởi tạo giá trị mới có thể sử dụng được
        int a = 0;
        System.out.println("a = " + a);

    }
}
