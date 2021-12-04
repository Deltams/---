package javame1;

public class SalesOb {

    private int idSales;
    private int idSeller;
    private int idProduct;
    private int quantityGoodsSold;
    private String dateSale;

    public SalesOb() {
    }
    
    public SalesOb(SalesOb other) {
        this.idSales = other.getIdSales();
        this.idSeller = other.getIdSeller();
        this.idProduct = other.getIdProduct();
        this.quantityGoodsSold = other.getQuantityGoodsSold();
        this.dateSale = other.getDateSale();
    }

    public SalesOb(int idSales, int idSeller, int idProduct, int quantityGoodsSold, String dateSale) {
        this.idSales = idSales;
        this.idSeller = idSeller;
        this.idProduct = idProduct;
        this.quantityGoodsSold = quantityGoodsSold;
        this.dateSale = dateSale;
    }

    public int getIdSales() {
        return this.idSales;
    }

    public int getIdSeller() {
        return this.idSeller;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public int getQuantityGoodsSold() {
        return this.quantityGoodsSold;
    }

    public String getDateSale() {
        return this.dateSale;
    }

    public void setIdSales(int other) {
        this.idSales = other;
    }

    public void setIdSeller(int other) {
        this.idSeller = other;
    }

    public void setIdProduct(int other) {
        this.idProduct = other;
    }

    public void setQuantityGoodsSold(int other) {
        this.quantityGoodsSold = other;
    }

    public void setDateSale(String other) {
        this.dateSale = other;
    }

    @Override
    public String toString() {
        return "SalesOb{"
                + "idSales=" + this.idSales + ", "
                + "idSeller=" + this.idSeller + ", "
                + "idProduct=" + this.idProduct + ", "
                + "quantityGoodsSold=" + this.quantityGoodsSold + ", "
                + "dateSale=" + this.dateSale + "}";
    }
}
