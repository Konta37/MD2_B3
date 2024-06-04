package TT.TTB3;

public class main {
    public static void main(String[] args) {
        //Tạo 2 category
        Category dm1 = new Category(1, "Quần");
        Category dm2 = new Category(2, "Áo");
        //tạo các sản phẩm thuộc danh mục 1
        Product product1 = new Product(1, "Quần âu", 150000, dm1);
        Product product2 = new Product(2, "Quần Jean", 250000, dm1);
        //tạo các sản phẩm thuộc danh mục 2
        Product product3 = new Product(3, "Áo sơ mi", 1250000, dm2);
        Product product4 = new Product(4, "Áo phông", 170000, dm2);

        //Hiển thị
        System.out.println("Tất cả sản phẩm: ");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}
