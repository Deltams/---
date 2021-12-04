package javame1;

public class Product {

    private int idProduct;
    private String name;

    public Product() {
    }

    public Product(Product other) {
        this.idProduct = other.getIdProduct();
        this.name = other.getNameProduct();
    }

    public Product(int idProduct, String name) {
        this.idProduct = idProduct;
        this.name = name;
    }

    public int getIdProduct() {
        return this.idProduct;
    }
    
    public String getNameProduct() {
        return this.name;
    }
    
    public void getIdProduct(int other) {
        this.idProduct = other;
    }
    
    public void getNameProduct(String other) {
        this.name = other;
    }
    
    @Override
    public String toString() {
        return "TopFive{"
                + "idTop=" + this.idProduct + ", "
                + "quantityGoodsSold=" + this.name + "}";
    }
}
