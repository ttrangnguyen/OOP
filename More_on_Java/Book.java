public class Book {
    private String title;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Book(String _title, int _price){
        this.title = _title;
        this.price = _price;
    }

    //Trong Java, mọi lớp đều là lớp con của Object
    //Để so sánh hai đối tượng, lớp Object sử dụng phương thức equals
    //Chi tiết về các phương thức mà Object cung cấp có thể xem tại: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
    //Để cài đặt chính xác hai đối tượng Book như thế nào là "equal",
    //lớp Book cần cài đè (override) phương thức equals
    @Override
    public boolean equals(Object o){
        //Kiểm tra o là một đối tượng kiểu Book trước khi ép kiểu ở tại dòng 35
        if(o instanceof Book) {
            Book b = (Book) o;
            if(title.equals(b.title)) {
                return true;
            }
        }
        return false;
    }

    public float getPriceWithDiscount(float _discount){

        float newPrice = price*_discount;
        _discount = 0;
        return newPrice;
    }
}
