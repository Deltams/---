package javame1;

public class SredZnach {
    private int id;
    private String dateSale;
    private double medium;
    
    public SredZnach() {
    }
    
    public SredZnach(SredZnach other) {
        this.id = other.getId();
        this.dateSale = other.getDateSale();
        this.medium = other.getMedium();
    }

    public SredZnach(int id, String dateSale, double medium) {
        this.id = id;
        this.dateSale = dateSale;
        this.medium = medium;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getDateSale() {
        return this.dateSale;
    }
    
    public double getMedium() {
        return this.medium;
    }
    
    public void getId(int other) {
        this.id = other;
    }
    
    public void getDateSale(String other) {
        this.dateSale = other;
    }
    
    public void getMedium(double other) {
        this.medium = other;
    }
    
    @Override
    public String toString() {
        return "TopFive{"
                + "idTop=" + this.id + ", "
                + "product=" + this.dateSale + ", "
                + "quantityGoodsSold=" + this.medium + "}";
    }
}
