package TT.TTB3;

public class Category {
    int categoryID;
    String categoryName;
    //Phương thức khởi tạo không tham số
    public Category(){

    }
    //Phương thức khởi tạo khi thêm 2 tham số.
    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }
    //Show ra
    public void display(){
        System.out.println("Mã danh mục: " + categoryName + "\n" +
                            "Tên danh mục: " + categoryID);
    }
}
