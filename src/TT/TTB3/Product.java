package TT.TTB3;

public class Product {
    int productID;
    String productName;
    double productPrice;
    Category category;

    //Phương thức khởi tạo 0 tham số
    public Product() {

    }

    // phương thức khởi tạo nhiều tham số
    public Product(int productID, String productName, double productPrice, Category category) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void display() {
        System.out.println("Mã sản phẩm: " + productID + "\n"
                + "Tên sản phẩm: " + productName + "\n"
                + "Giá: " + productPrice + "\n"
                + "Danh mục: " + category.categoryName);
    }
}
