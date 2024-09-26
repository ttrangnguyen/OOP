public class Test {

    public static void main(String[] args){
        //Java là ngôn ngữ định kiểu mạnh
        //biến a kiểu int
        int a = 10;
        //biến b kiểu short
        short b = 10;
        //a và b thuộc hai kiểu dữ liệu khác nhau,
        // nên sẽ không thể thực hiện việc gán b = a;
        //tuy nhiên int có kích thước lớn hơn short,
        //nên gán a = b; thì hợp lệ.

        //a và b là các biến kiểu nguyên thuỷ
        //Với các dữ liệu kiểu nguyên thuỷ,
        // Java cung cấp các lớp wrapper để tạo ra các đối tượng
        //iA là một đối tượng kiểu Integer
        Integer iA = new Integer(10);
        Integer iB = new Integer(10);


        //Để so sánh giá trị của hai đối tượng sử dụng equals
        if (iA.equals(iB)){
            System.out.println("Using equals: iA and iB are equal");
        }

        //Việc sử dụng == so sánh giá trị lưu trên biến iA và iB
        //Thực tế giá trị lưu trên các biến này là các tham chiếu tới các đối tượng
        //Hai biến này tham chiếu đến các đối tượng khác nhau
        //Do đó, phép so sánh này trả về kết quả false
        if (iA == iB){
            System.out.println("Using ==: iA and iB are equal");
        }


        Book b1 = new Book("OOP", 10);
        Book b2 = new Book("OOP", 10);

        if (b1.equals(b2)){
            System.out.println("b1 and b2 are the same");
        }


        Shop s1 = new Shop();
        //Nếu không có câu lệnh kiểm tra instanceof (dòng 34) file Book.java
        //Câu lệnh dòng 49 sẽ gây lỗi khi chạy chương trình
        //Do s1 không tham chiếu tới một đối tượng Book,
        // mà s1 tham chiếu tới một đối tượng Shop
        if(b1.equals(s1)){
            System.out.println("b1 and s1 are equal.");
        }

        float discount = 0.5f;
        //Chuyền tham số trong Java là chuyền tham trị (pass-by-value)
        //khi discount được truyền vào phương thức getPriceWithDiscount (dòng 59 file này),
        //giá trị của discount được copy vào biến _discount của phương thức getPriceWithDiscount (dòng 43 file Book.java)
        //các thao tác bên trong phương thức getPriceWithDiscount có thể thay đổi giá trị của _discount,
        //nhưng không ảnh hưởng đến biến discount (khai báo ở dòng 53 file này)
        System.out.println("new price:" + b1.getPriceWithDiscount(discount));
        System.out.println("discount:" + discount);

        //Truyền tham số trong Java là truyền tham trị (pass-by-value)
        //khi gọi reset1, giá trị được lưu trên b1 sẽ được copy vào b (khai báo tại dòng 83 file này)
        //Dòng 85 thay đổi giá trị của b
        //việc này không ảnh hưởng tới giá trị lưu trên b1
        //Lưu ý, giá trị lưu trên b1 là tham chiếu tới đối tượng
        reset1(b1);
        System.out.println("b1 title:" + b1.getTitle());

        //Truyền tham số trong Java là truyền tham trị (pass-by-value)
        //khi gọi resert2, giá trị được lưu trên b1 sẽ được copy vào b (khai báo tại dòng 88 file này)
        //Lưu ý, giá trị lưu trên b1 là tham chiếu tới đối tượng
        //Các thao tác bên trong phương thức reset2 (dòng 89, 90) thực chất là thao tác qua b của phương thức này, không liên quan tới b1
        //Tuy nhiên, sau khi giá trị của b1 được copy vào b, nghĩa là b và b1 cùng tham chiếu tới một đối tượng
        //Dòng 89, 90 thay đổi giá trị các thuộc tính của đối tượng này
        //Do đó, bạn sẽ thấy dòng 78 in ra title của b1 bị thay đổi
        reset2(b1);
        System.out.println("b1 title:" + b1.getTitle());

    }


    private static void reset1(Book b) {
        Book newbook = new Book("-", -1);
        b = newbook;
    }

    private static void reset2(Book b) {
        b.setTitle("-");
        b.setPrice(-1);
    }


}
