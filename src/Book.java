public class Book extends Product {
    private String s_Author;

    public Book() {
    }

    public Book(String s_Name, String s_Branch, Double d_Price, String s_Author) {
        super(s_Name, s_Branch, d_Price);
        this.s_Author = s_Author;
    }

    public String get_s_Author() {
        return s_Author;
    }

    public void set_s_Author(String s_Author) {
        this.s_Author = s_Author;
    }
}
