package javame1;

public class TopFive {
    private int idTop;
    private String product;
    private int quantityGoodsSold;
    
    public TopFive() {
    }
    
    public TopFive(TopFive other) {
        this.idTop = other.getIdTop();
        this.product = other.getProduct();
        this.quantityGoodsSold = other.getQuantityGoodsSold();
    }

    public TopFive(int idTop, String product, int quantityGoodsSold) {
        this.idTop = idTop;
        this.product = product;
        this.quantityGoodsSold = quantityGoodsSold;
    }
    
    public int getIdTop() {
        return this.idTop;
    }
    
    public String getProduct() {
        return this.product;
    }
    
    public int getQuantityGoodsSold() {
        return this.quantityGoodsSold;
    }
    
    public void setIdTop(int other) {
        this.idTop = other;
    }
    
    public void setProduct(String other) {
        this.product = other;
    }
    
    public void setQuantityGoodsSold(int other) {
        this.quantityGoodsSold = other;
    }
    
    @Override
    public String toString() {
        return "TopFive{"
                + "idTop=" + this.idTop + ", "
                + "product=" + this.product + ", "
                + "quantityGoodsSold=" + this.quantityGoodsSold + "}";
    }
}
