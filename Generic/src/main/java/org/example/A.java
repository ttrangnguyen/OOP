package org.example;

//A không là một lớp tổng quát vì không có tham số kiểu
public class A {
    //getMiddle là một phương thức tổng quát
    //Nó có thể nhận vào là một mảng thuộc bất kỳ kiểu dữ liệu nào
    //Khi gọi getMiddle cần chỉ rõ kiểu của tham số T
    // (chi tiết xem cách gọi phương thức này trong file Main.java)
    public <T> T getMiddle(T[] arr){
        if(arr.length >0){
            return arr[arr.length/2];
        }
        return null;
    }

}
