public class Student {

    //Các biến thuộc tính được khai báo private
    // để tránh việc gán các giá trị không hợp lệ từ bên ngoài
    private String studentID;
    private int age;

    //Constructor cùng tên với tên lớp
    //Không có kiểu trả về
    Student(){
        age = 18;
    }

    Student(int _age){
        age = _age;
    }
    Student(int _age, String _ID){
        age = _age;
        studentID = _ID;

    }

    //Dùng các phương thức setter và getter để bên ngoài
    // có thể truy cập (đọc và ghi) các thuộc tính của đối tượngvoid
    //lưu ý kiểm tra tính hợp lệ của giá trị thuộc tính trong phương thức setter
    public void setAge(int _age){
        if(_age >= 18){
            age = _age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setStudentID(String _studentID){
        if (_studentID != null){
            studentID = _studentID;
        }
    }

    public String getStudentID(){
        return studentID;
    }



    public void printInfo(){
        System.out.println("I am " + studentID +
                " and I am " + age + "years old");
    }

    //Các phương thức trùng tên khác danh sách tham số
    // là cơ chế nạp chồng (overload)
    public void printInfo(float _gpa){
        System.out.println("I am " + studentID +
                " and I am " + age + " years old. " +
                " My GPA is " + _gpa);
    }
}
