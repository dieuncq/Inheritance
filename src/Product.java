public class Product {
    private String s_Name;
    private String s_Branch;
    private Double d_Price;

    public Product() {
    }

    public Product(String s_Name, String s_Branch, Double d_Price) {
        this.s_Name = s_Name;
        this.s_Branch = s_Branch;
        this.d_Price = d_Price;
    }

    public String get_s_Name() {
        return s_Name;
    }

    public void set_s_Name(String s_Name) {
        this.s_Name = s_Name;
    }

    public String get_s_Branch() {
        return s_Branch;
    }

    public void set_s_Branch(String s_Branch) {
        this.s_Branch = s_Branch;
    }

    public Double get_d_Price() {
        return d_Price;
    }

    public void set_d_Price(Double d_Price) {
        this.d_Price = d_Price;
    }
}