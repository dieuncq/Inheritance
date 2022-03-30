public class Pen extends Product {
    private String s_Color;

    public Pen() {
    }

    public Pen(String s_Name, String s_Branch, Double d_Price, String s_Color) {
        super(s_Name, s_Branch, d_Price);
        this.s_Color = s_Color;
    }

    public String get_s_Color() {
        return s_Color;
    }

    public void set_s_Color(String s_Color) {
        this.s_Color = s_Color;
    }
}
