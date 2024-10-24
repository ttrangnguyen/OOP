package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        write("oop.txt", "hello");
        secondRun();

        try{
            thirdRun();
        }catch(InputMismatchException e){
            System.out.println("Exception of thirdRun is handled in main");
        }

        int r = sum();
        System.out.println("r = " + r);
    }

    public static void write (String filename, String s) {
        try{
            File file = new File(filename);
            //PrintWriter ném ra một exception thuộc loại FileNotFoundException
            //Trong chương trình có gọi đến PrintWriter, cần xử lý exception này
            //Một trong các cách xử lý là bọc chúng vào khối try-catch,
            //khối try xử lý logic của chương trình, nơi có thể xảy ra ngoại lệ
            //khối catch thực hiện việc bắt ngoại lệ nếu ngoại lệ xảy ra và đưa ra phương án xử lý phù hợp
            //FileNotFoundException thuộc loại ngoại lệ checked.
            // Nghĩa là khi chương trình gọi đến các phương thức có ném ra các ngoại lệ trong nhóm checked,
            //compiler sẽ kiểm tra xem chương trình có xử lý ngoại lệ đó không (bọc nó trong try-catch hoặc ném tiếp).
            //Nếu chương trình chưa xử lý ngoại lệ, compiler sẽ không cho dịch chương trình.
            PrintWriter out = new PrintWriter(file);
            out.println(s);
            out.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found in method write");
            //Có thể in ra stack trace để dễ dàng debug
//            e.printStackTrace();
        }
    }

    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        //scanner.nextInt() có thể ném ra ngoại lệ thuộc loại InputMismatchException
        //Tuy nhiên đây là một loại ngoại lệ thuộc nhóm unchecked
        //Các ngoại lệ là lớp con của RuntimeException đều là ngoại lệ unchecked
        // (ví dụ NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException...)
        //Compiler không quan tâm đến việc các ngoại lệ này được ném ra ở đâu, chúng có được xử lý không
        //vì các ngoại lệ thường gây ra bởi lỗi logic của lập trình viên.
        //Do đó, với các ngoại lệ này bạn có thể xử lý bằng khối try-catch, hoặc ném tiếp, hoặc không làm gì cả
        // Compiler vẫn dịch chương trình thành không
        //Tuy nhiên, nếu ngoại lệ không được xử lý, khi có ngoại lệ bị ném ra, chương trình vẫn bị crashed
        try {
            System.out.println("input a: ");
            int a = scanner.nextInt();
            System.out.println("input b: ");
            int b = scanner.nextInt();
            return a + b;
        }catch (InputMismatchException e){
            System.out.println("Input mismatch");
            return -1;
        }

    }



    //Một phương thức khai báo ném ra một loại ngoại lệ bằng các khai báo throws + kiểu ngoại lệ tại khai báo tên phương thức
    //Một phưng thức có thể ném nhiều loại ngoại lệ
    public static void firstRun() throws InputMismatchException{
        //do sth
        //Ngoại lệ cũng là một đối tượng
        //Để ném ra ngoại lệ tương ứng, chúng ta thực hiện khởi tạo đối tượng bằng từ khoá new
        //và ném ra với từ khoá throw
        throw new InputMismatchException();
    }


    //Có 3 cách để xử lý ngoại lệ
    //cách 1: Bọc trong khối try-catch
    public static void secondRun(){
        try {
            firstRun();
        }catch (InputMismatchException e){
            System.out.println("secondRun handles exception");
            //Có thể in ra stack trace để dễ dàng debug
//            e.printStackTrace();
        }

    }

    //Có 3 cách để xử lý ngoại lệ
    //cách 2: né, không xử lý
    //ngoại lệ sẽ rơi tiếp xuống nơi gọi thirdRun
    //Ví dụ main gọi thirdRun, main sẽ phải xử lý ngoại lệ
    //nếu main tiếp tục né, ngoại lệ sẽ rơi xuống máy ảo Java
    //và chương trình vẫn crash
    //Do đó, việc né ngoại lệ chỉ là giải pháp tạm trì hoãn việc xử lý ngoại lệ
    public static void thirdRun() throws InputMismatchException{
            firstRun();
    }

    //Có 3 cách để xử lý ngoại lệ
    //cách 3: bắt ngoại lệ, xử lý một phần và ném tiếp đi
    public static void fourthRun() throws Exception{
        try {
            firstRun();
        }catch (InputMismatchException e){
            System.out.println("fourthRun handles exception");
            e.printStackTrace();
            throw new Exception();
        }

    }

}